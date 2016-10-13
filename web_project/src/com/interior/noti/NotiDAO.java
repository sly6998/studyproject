package com.interior.noti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		return null;
	}

	public void setReadCountUpdate(int num) {//공지사항 조회수 업데이트
		// TODO Auto-generated method stub
		
	}

	public NotiBean getDetail(int num) {//공지사항 글 보기(상세보기)
		// TODO Auto-generated method stub
		return null;
	}

	public boolean notiInsert(NotiBean notidata) {//공지사항 글쓰기(관리자)
		// TODO Auto-generated method stub
		return false;
	}

	public NotiBean notimodifyview(int num) {//공지사항 수정할 글 불러오기(관리자)
		// TODO Auto-generated method stub
		return null;
	}

	public boolean boardModify(NotiBean notidata) {//공지사항 수정 action(관리자)
		// TODO Auto-generated method stub
		return false;
	}

	public boolean notidelete(int num) {//공지사항 글 삭제 action(관리자)
		// TODO Auto-generated method stub
		return false;
	}

}
