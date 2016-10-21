package com.interior.reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.interior.noti.NotiBean;

public class ReplyDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	
	public ReplyDAO(){
		try{
			Context init = new InitialContext();
			ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB connection failed : "+e);
			return;
		}
	}
	
	// 공지사항 글 답변
	public int NotiReply(NotiBean noti){
		String noti_reply_sql = "select max(noti_num) from noti";
		String sql="";
		
		int num=0;
		int result=0;
		
		int re_ref = noti.getNOTI_RE_REF();
		int re_seq = noti.getNOTI_RE_SEQ();
		int re_lev = noti.getNOTI_RE_LEV();
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(noti_reply_sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				num=rs.getInt(1)+1;
			}else{
				num=1;
			}
			sql = "update notiboard set noti_re_seq=noti_re_seq+1 where noti_re_ref=? and noti_re_seq>?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
		}
	}
	
}
