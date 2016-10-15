package com.interior.noti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class NotiDAO {
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	public NotiDAO(){
		try{
			Context init = new InitialContext();
			ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB connection failed : "+e);
			return;
		}
	}

	public int getListCount() {//총 게시판 리스트 수
		// TODO Auto-generated method stub
		int count = 0;
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement("select count(*) from noti");
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				count = rs.getInt(1);
			}
		}catch(Exception e){
			System.out.println("getListCount error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return count;
	}

	public List getNotiList(int page, int limit) {//게시판 리스트를 받아옴
		// TODO Auto-generated method stub
		String sql = "select * from " +
		"(select rownum rnum, noti_num, noti_member_ID, noti_member_name, noti_subject, noti_content," +
		"noti_readcount, noti_file, noti_date from " +
		"(select * from noti order by " +
		"noti_date desc)) " +
		"where rnum>=? and rnum<=?";
		
		List list = new ArrayList();
		
		int startrow=(page-1)*10+1;
		int endrow=startrow+limit-1;
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				NotiBean noti = new NotiBean();
				noti.setNOTI_NUM(rs.getInt("NOTI_NUM"));
				noti.setNOTI_MEMBER_ID(rs.getString("NOTI_MEMBER_ID"));
				noti.setNOTI_MEMBER_NAME(rs.getString("NOTI_MEMBER_NAME"));
				noti.setNOTI_SUBJECT(rs.getString("NOTI_SUBJECT"));
				noti.setNOTI_CONTENT(rs.getString("NOTI_CONTENT"));
				noti.setNOTI_READCOUNT(rs.getInt("NOTI_READCOUNT"));
				noti.setNOTI_FILE(rs.getString("NOTI_FILE"));
				noti.setNOTI_DATE(rs.getDate("NOTI_DATE"));
				list.add(noti);
			}
			return list;
		}catch(Exception e){
			System.out.println("getNotiList error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public void setReadCountUpdate(int num) {//공지사항 조회수 업데이트
		// TODO Auto-generated method stub
		String sql = "update noti set noti_readcount = "+
		"noti_readcount+1 where noti_num = "+num;
		
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.executeQuery();
		}catch(Exception e){
			System.out.println("setReadCount error : "+e);
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				
				
				if(con!=null)con.close();
			}catch(Exception e) {}
		}
	}

	public NotiBean getDetail(int num) throws Exception {//공지사항 글 보기(상세보기)
		// TODO Auto-generated method stub
		NotiBean noti = null;
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement("select * from noti where noti_num=?");
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				noti = new NotiBean();
				noti.setNOTI_NUM(rs.getInt("NOTI_NUM"));
				noti.setNOTI_MEMBER_ID(rs.getString("NOTI_MEMBER_ID"));
				noti.setNOTI_MEMBER_NAME(rs.getString("NOTI_MEMBER_NAME"));
				noti.setNOTI_SUBJECT(rs.getString("NOTI_SUBJECT"));
				noti.setNOTI_CONTENT(rs.getString("NOTI_CONTENT"));
				noti.setNOTI_FILE(rs.getString("NOTI_FILE"));
				noti.setNOTI_READCOUNT(rs.getInt("NOTI_READCOUNT"));
				noti.setNOTI_DATE(rs.getDate("NOTI_DATE"));
			}
			return noti;
		}catch(Exception e){
			System.out.println("getDetail error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public boolean notiInsert(NotiBean notidata) {//공지사항 글쓰기(관리자)
		// TODO Auto-generated method stub
		int num = 0;
		String sql = "";
		int result = 0;
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement("select max(board_num) from noti");
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				num = rs.getInt(1)+1;
			}else{
				num=1;
			}
			
			sql = "insert into noti (NOTI_NUM, NOTI_MEMBER_ID, NOTI_MEMBER_NAME,";
			sql+="NOTI_SUBJECT, NOTI_CONTENT, NOTI_FILE, NOTI_READCOUNT, NOTI_DATE) values(?,?,?,?,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, notidata.getNOTI_MEMBER_ID());
			pstmt.setString(3, notidata.getNOTI_MEMBER_NAME());
			pstmt.setString(4, notidata.getNOTI_SUBJECT());
			pstmt.setString(5, notidata.getNOTI_CONTENT());
			pstmt.setString(6, notidata.getNOTI_FILE());
			pstmt.setInt(7, notidata.getNOTI_READCOUNT());
			pstmt.setDate(8, notidata.getNOTI_DATE());
			
			result = pstmt.executeUpdate();
			if(result==0){
				return false;
			}
			
		}catch(Exception e){
			System.out.println("notiInsert error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return false;
	}

	public NotiBean notimodifyview(int num) {//공지사항 수정할 글 불러오기(관리자)
		// TODO Auto-generated method stub
		NotiBean noti = null;
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement("select * from noti where NOTI_NUM=?");
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				noti = new NotiBean();
				noti.setNOTI_NUM(rs.getInt("NOTI_NUM"));
				noti.setNOTI_MEMBER_ID(rs.getString("NOTI_MEMBER_ID"));
				noti.setNOTI_MEMBER_NAME(rs.getString("NOTI_MEMBER_NAME"));
				noti.setNOTI_SUBJECT(rs.getString("NOTI_SUBJECT"));
				noti.setNOTI_CONTENT(rs.getString("NOTI_CONTENT"));
				noti.setNOTI_FILE(rs.getString("NOTI_FILE"));
				noti.setNOTI_READCOUNT(rs.getInt("NOTI_READCOUNT"));
				noti.setNOTI_DATE(rs.getDate("NOTI_DATE"));
			}
			return noti;
		}catch(Exception e){
			System.out.println("notimodifyview error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public boolean boardModify(NotiBean notidata) { //공지사항 수정 action(관리자)
		// TODO Auto-generated method stub
		String sql = "update noti set NOTI_SUBJECT=?,";
		sql+="NOTI_CONTENT=? where NOTI_NUM=?";
		
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, notidata.getNOTI_SUBJECT());
			pstmt.setString(2, notidata.getNOTI_CONTENT());
			pstmt.setInt(3, notidata.getNOTI_NUM());
			pstmt.executeUpdate();
			return true;
		}catch(Exception e){
			System.out.println("boardModify error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return false;
	}

	public boolean notidelete(int num) {//공지사항 글 삭제 action(관리자)
		// TODO Auto-generated method stub
		String noti_delete_sql = "delete from noti where NOTI_num=?";
		
		int result = 0;
		
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(noti_delete_sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
			if(result==0){
				return false;
			}
			return true;
		}catch(Exception e){
			System.out.println("notidelete error : "+e);
		}finally{
			try{
				if(pstmt!=null){
					pstmt.close();
				}
				if(con!=null){
					con.close();
				}
			}catch(Exception ex) {}
		}
		return false;
	}
}
