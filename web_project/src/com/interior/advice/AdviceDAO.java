package com.interior.advice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AdviceDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	
	public AdviceDAO(){
		try{
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB connection failed : "+e);
			return;
		}
	}

	public int getListCount() {  //총 Advice 리스트 수
		// TODO Auto-generated method stub
		int count = 0;
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement("select count(*) from Advice");
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

	public List getAdviceList(int page, int limit) {//Advice 리스트 불러오기
		// TODO Auto-generated method stub
		String sql = "select * from Advice " +
		"(select rownum rnum, advice_member_email, advice_member_name, advice_member_tel, advice_content, advice_date from " +
		"(select * from advice order by " +
		"advice_date desc)) " +
		"where rnum>=? and rnum<=?";
		
		List list = new ArrayList();
		
		int startrow=(page-1)*10+1; //읽기 시작할 row 번호 입니다.
		int endrow = startrow+limit-1; //읽을 마지막 row 번호 입니다.
		
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				AdviceBean advice = new AdviceBean();
				advice.setADVICE_MEMBER_ID(rs.getString("ADVICE_MEMBER_EMAIL"));
				advice.setADVICE_MEMBER_NAME(rs.getString("ADVICE_MEMBER_NAME"));
				advice.setADVICE_MEMBER_TEL(rs.getString("ADVICE_MEMBER_TEL"));
				advice.setADVICE_CONTENT(rs.getString("ADVICE_CONTENT"));
				advice.setADVICE_DATE(rs.getDate("ADVICE_DATE"));
				list.add(advice);
			}
			return list;
		}catch(Exception e){
			System.out.println("getAdviceList error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public AdviceBean getDetail(int num) throws Exception {  //Advice 상세보기
		// TODO Auto-generated method stub
		AdviceBean advice = null;
		String sql = "select * from advice where advice_num=?";
		pstmt.setInt(1, num);
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				advice = new AdviceBean();
				advice.setADVICE_NUM(rs.getInt("ADVICE_NUM"));
				advice.setADVICE_MEMBER_ID(rs.getString("ADVICE_MEMBER_EMAIL"));
				advice.setADVICE_MEMBER_NAME(rs.getString("ADVICE_MEMBER_NAME"));
				advice.setADVICE_MEMBER_TEL(rs.getString("ADVICE_MEMBER_TEL"));
				advice.setADVICE_CONTENT(rs.getString("ADVICE_CONTENT"));
				advice.setADVICE_DATE(rs.getDate("ADVICE_DATE"));
			}
			return advice;
		}catch(Exception e){
			System.out.println("getAdviceDetail error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public boolean advicedelete(int num) {//advice 게시글 삭제 action
		// TODO Auto-generated method stub
		String sql = "delete from advice where advice_num=?";
		
		int result = 0;
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
			if(result==0){
				return false;
			}
			return true;
		}catch(Exception e){
			System.out.println("advicedelete error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return false;
	}
}
