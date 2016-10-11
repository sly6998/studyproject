package com.interior.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO_d {
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	
	public MemberDAO_d(){
		try{
			Context init = new InitialContext();
			ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB 연결 실패 : " + e);
			return;
		}
	}

	public boolean joinMember(MemberBean member) {  // 회원가입 action
		// TODO Auto-generated method stub
		String sql = "Insert into member_info (member_name, member_email, member_pwd, member_addr_1, member_addr_2, member_addr_zip, member_tel, member_gender, member_birth, member_date) values (?,?,?,?,?,?,?,?,?,sysdate)";
		int result = 0;
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_NAME());
			pstmt.setString(2, member.getMEMBER_EMAIL());
			pstmt.setString(3, member.getMEMBER_PWD());
			pstmt.setString(4, member.getMEMBER_ADDR_1());
			pstmt.setString(5, member.getMEMBER_ADDR_2());
			pstmt.setString(6, member.getMEMBER_ADDR_ZIP());
			pstmt.setString(7, member.getMEMBER_TEL());
			pstmt.setString(8, member.getMEMBER_GENDER());
			pstmt.setString(9, member.getMEMBER_BIRTH());
			result = pstmt.executeUpdate();
			
			if(result!=0){
				return true;
			}
		}catch(Exception e){
			System.out.println("joinMember Error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return false;
	}

	public int isMember(MemberBean member) {  // 로그인 action
		// TODO Auto-generated method stub
		String sql = "select member_pwd from member_info where member_id=?";
		int result = -1;
		
		try{
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_EMAIL());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				if(rs.getString("member_pwd").equals(member.getMEMBER_PWD())){
					result = 1; //일치
				}else{
					result=0; //불일치
				}
			}else{
				result=-1; //아이디가 존재하지 않음.
			}
		}catch(Exception e){
			System.out.println("isMember Error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return result;
	}

	public List emailfind(MemberBean member) { // 이메일 찾기 action
		// TODO Auto-generated method stub
		String sql = "select * from member_info where member_name=? and member_tel=? and member_birth=?";
		List emailfind = new ArrayList();
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				MemberBean mb = new MemberBean();
				mb.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
				mb.setMEMBER_TEL(rs.getString("MEMBER_TEL"));
				mb.setMEMBER_BIRTH(rs.getString("MEMBER_BIRTH"));
				
				emailfind.add(mb);
				
			}else{
				System.out.println("god damn");
			}
			return emailfind;
		}catch(Exception e){
			System.out.println("emailfind error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public List pwdfind(MemberBean member) { // 비밀번호 찾기 action
		// TODO Auto-generated method stub
		String sql = "select * from member_info where member_email and member_name and member_tel and member_birth";
		List pwdfind = new ArrayList();
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				MemberBean mb = new MemberBean();
				mb.setMEMBER_EMAIL(rs.getString("MEMBER_EMAIL"));
				mb.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
				mb.setMEMBER_TEL(rs.getString("MEMBER_TEL"));
				mb.setMEMBER_BIRTH(rs.getString("MEMBER_BIRTH"));
				
				pwdfind.add(mb);
				
			}else{
				System.out.println("god damn");
			}
			return pwdfind;
		}catch(Exception e){
			System.out.println("pwdfind error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public boolean emaildelete(String member_email) {// 회원탈퇴 action
		// TODO Auto-generated method stub
		String sql1 = "delete from bakset where basket_member_email=?";
		String sql2 = "delete from member_info where member_email=?";
		boolean isSuccess = false;
			int result1 = 0;
			int result2 = 0;
		boolean result = false;
			System.out.println("deleteEmail = "+member_email);
		
			try{
				con = ds.getConnection();
				con.setAutoCommit(false);
				pstmt=con.prepareStatement(sql1);
				pstmt.setString(1, member_email);
				result1 = pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, member_email);
			
			result2 = pstmt.executeUpdate();
			
			if(result1>0 && result2>0){
				result = true;
			}
				isSuccess=true;
			}catch(Exception e){
				System.out.println("emaildelete error : "+e);
			}finally{
				try{
					if(isSuccess){
						con.commit();
					}else{
						con.rollback();
					}
				}catch(Exception e){};
					if(rs!=null)try{rs.close();}catch(SQLException ex){}
					if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
					if(con!=null)try{con.close();}catch(SQLException ex){}
				}
			return result;
			}

	public MemberBean memberview(String email) {// 회원정보 보기 action
		// TODO Auto-generated method stub
		return null;
	}

	public MemberBean membermodifyview(String email) {// 마이페이지 보기 action
		// TODO Auto-generated method stub
		return null;
	}

	public void membermodify(String email, MemberBean member) {// 마이페이지 수정 action
		// TODO Auto-generated method stub

	}

	public int getListCount() {//총 회원 수
		// TODO Auto-generated method stub
		return 0;
	}

	public List getBoardList(int page, int limit) {//회원 리스트
		// TODO Auto-generated method stub
		return null;
	}
}
