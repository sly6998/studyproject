package com.interior.notireply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.interior.noti.NotiBean;

public class NotireplyDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	
	public NotireplyDAO(){
		try{
			Context init = new InitialContext();
			ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB connection failed : "+e);
			return;
		}
	}
	
	
	// 공지사항 글 댓글 쓰기
		public int NotiReplyWrite(NotireplyBean notireplywrite){
			String noti_reply_sql = "select max(noti_reply_num) from noti";
			String sql="";
			
			int num=0;
			int result=0;
			
			int reply_ref = notireplywrite.getNOTI_REPLY_REF();
			int reply_seq = notireplywrite.getNOTI_REPLY_SEQ();
			int reply_lev = notireplywrite.getNOTI_REPLY_LEV();
			
			try{
				con=ds.getConnection();
				pstmt=con.prepareStatement(noti_reply_sql);
				rs=pstmt.executeQuery();
				
				if(rs.next()){
					num=rs.getInt(1)+1;
				}else{
					num=1;
				}
				sql = "update noti_reply set noti_reply_seq=noti_reply_seq+1 where noti_reply_ref=? and noti_reply_seq>?";
				
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, reply_ref);
				pstmt.setInt(2, reply_seq);
				
				sql = "insert into noti_reply (noti_reply_num, noti_reply_member_id, noti_reply_content, noti_reply_ref, noti_reply_seq, noti_reply_lev, noti_reply_date) values (noti_reply_seq.nextval,?,?,?,?,?sysdate)";
				
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, notireplywrite.getNOTI_REPLY_MEMBER_ID());
				pstmt.setString(2, notireplywrite.getNOTI_REPLY_CONTENT());
				pstmt.setInt(3, reply_ref);
				pstmt.setInt(4, reply_seq);
				pstmt.setInt(5, reply_lev);
				pstmt.executeUpdate();
				return num;
			}catch(Exception e){
				System.out.println("NotiReplyWrite error : "+e);
			}finally{
				if(rs!=null)try{rs.close();}catch(SQLException e){}
				if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
				if(con!=null)try{con.close();}catch(SQLException e){}
			}
			return 0;
		}
}
