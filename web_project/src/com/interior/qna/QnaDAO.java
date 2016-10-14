package com.interior.qna;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class QnaDAO {
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	public QnaDAO(){
		try{
			Context init = new InitialContext();
			ds=(DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB connection failed : "+e);
			return;
		}
	}

	public int getListCount() {//qna 게시판 리스트의 총 게시글 수 구하기 
		// TODO Auto-generated method stub
		int count=0;
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement("select count(*) from qna_board");
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				count=rs.getInt(1);
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

	public List getQnaList(int page, int limit) {//qna 게시글 목록 불러오기
		// TODO Auto-generated method stub
		String sql = "select * from " +
		"(select rownum rnum, qna_num, qna_member_email, qna_member_name" +
		"qna_subject, qna_content, qna_date, qna_seq, qna_ref, qna_lev" +
		"qna_readcount, qna_file from " +
		"(select * from qna_board order by " +
		"board_ref_number desc, board_seq_number asc))" +
		"where rnum>=? and rnum<=?";
		
		List list = new ArrayList();
		
		int startrow = (page-1)*10+1;
		int endrow = startrow+limit-1;
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				QnaBean qna = new QnaBean();
				qna.setQnA_NUM(rs.getInt("QNA_NUM"));
				qna.setQnA_MEMBER_EMAIL(rs.getString("QNA_MEMBER_EMAIL"));
				qna.setQnA_MEMBER_NAME(rs.getString("QNA_MEMBER_NAME"));
				qna.setQnA_SUBJECT(rs.getString("QNA_SUBJECT"));
				qna.setQnA_CONTENT(rs.getString("QNA_CONTENT"));
				qna.setQnA_DATE(rs.getDate("QNA_DATE"));
				qna.setQnA_SEQ(rs.getInt("QNA_SEQ"));
				qna.setQnA_REF(rs.getInt("qnA_REF"));
				qna.setQnA_LEV(rs.getInt("qnA_LEV"));
				qna.setQnA_READCOUNT(rs.getInt("qnA_READCOUNT"));
				qna.setQnA_FILE(rs.getString("qnA_FILE"));
				list.add(qna);
			}
			return list;
		}catch(Exception e){
			System.out.println("getQnaList error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public void setReadCountUpdate(int num) throws Exception{//qna 게시글 조회수 업데이트
		// TODO Auto-generated method stub
		String sql = "update qna_board set qna_readcount = "+
		"qna_readcount+1 where qna_num = "+num;
		
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		}catch(Exception e){
			System.out.println("setReadCountUpdate error : "+e);
		}finally{
			try{
				if(pstmt!=null){
					pstmt.close();
				}
				if(con!=null){
					con.close();
				}
			}catch(Exception e){}
		}
	}

	public QnaBean getDetail(int num) {//qna 게시글 상세보기
		// TODO Auto-generated method stub
		return null;
	}

	public boolean qnaInsert(QnaBean qnadata) {//qna 글쓰기 action
		// TODO Auto-generated method stub
		return false;
	}

	public QnaBean qnamodifyView(int num) {//qna 게시글 수정 페이지
		// TODO Auto-generated method stub
		return null;
	}

	public boolean qnaModify(QnaBean qnadata) {//qna 게시글 수정 action
		// TODO Auto-generated method stub
		return false;
	}

	public boolean qnadelete(int num) {//qna 게시글 삭제 action
		// TODO Auto-generated method stub
		return false;
	}

}
