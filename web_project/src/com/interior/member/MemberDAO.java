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

public class MemberDAO {
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	
	public MemberDAO(){
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
		String sql = "Insert into member_info (member_num, member_name, member_ID, member_pwd, member_addr_1, member_addr_2, member_addr_zip, member_tel, member_gender, member_year, member_month, member_day, member_date) values (member_info_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,sysdate)";
		int result = 0;
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_NAME());
			pstmt.setString(2, member.getMEMBER_ID());
			pstmt.setString(3, member.getMEMBER_PWD());
			pstmt.setString(4, member.getMEMBER_ADDR_1());
			pstmt.setString(5, member.getMEMBER_ADDR_2());
			pstmt.setString(6, member.getMEMBER_ADDR_ZIP());
			pstmt.setString(7, member.getMEMBER_TEL());
			pstmt.setString(8, member.getMEMBER_GENDER());
			pstmt.setInt(9, member.getMEMBER_YEAR());
			pstmt.setInt(10, member.getMEMBER_MONTH());
			pstmt.setInt(11, member.getMEMBER_DAY());
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
			pstmt.setString(1, member.getMEMBER_ID());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				if(rs.getString("member_pwd").equals(member.getMEMBER_PWD())){
					result = 1; //일치
				}else{
					result=0; //불일치(아이디는 존재)
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

	public MemberBean IDfind(MemberBean member) { // 아이디 찾기 action
		// TODO Auto-generated method stub
		String sql = "select * from member_info where member_name=? and member_tel=? and member_year=? and member_month=? and member_day=?";
		MemberBean mb = new MemberBean();
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_NAME());
			pstmt.setString(2, member.getMEMBER_TEL());
			pstmt.setInt(3, member.getMEMBER_YEAR());
			pstmt.setInt(4, member.getMEMBER_MONTH());
			pstmt.setInt(5, member.getMEMBER_DAY());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				mb.setMEMBER_ID(rs.getString("MEMBER_ID"));
			}else if(!rs.next()){
				mb.setMEMBER_ID("");
			}else{
				System.out.println("god damn");
				return null;
			}
			return mb;
		}catch(Exception e){
			System.out.println("IDfind error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public MemberBean pwdfind(MemberBean member) { // 비밀번호 찾기 action
		// TODO Auto-generated method stub
		String sql = "select * from member_info where member_ID=? and member_name=? and member_tel=? and member_year=? and member_month=? and member_day=?";
		MemberBean mb = new MemberBean();
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_ID());
			pstmt.setString(2, member.getMEMBER_NAME());
			pstmt.setString(3, member.getMEMBER_TEL());
			pstmt.setInt(4, member.getMEMBER_YEAR());
			pstmt.setInt(5, member.getMEMBER_MONTH());
			pstmt.setInt(6, member.getMEMBER_DAY());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				mb.setMEMBER_PWD(rs.getString("MEMBER_PWD"));
			}else if(!rs.next()){
				mb.setMEMBER_PWD("");
			}else{
				System.out.println("god damn");
				return null;
			}
			return mb;
		}catch(Exception e){
			System.out.println("PWDfind error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public boolean IDdelete(MemberBean member) {// 회원탈퇴 action
		// TODO Auto-generated method stub
		String sql1 = "delete from bakset where basket_member_ID=?";
		String sql2 = "delete from member_info where member_ID=?";
		String ID = member.getMEMBER_ID();
		boolean isSuccess = false;
			int result1 = 0;
			int result2 = 0;
		boolean result = false;
		
			try{
				con = ds.getConnection();
				con.setAutoCommit(false);
				pstmt=con.prepareStatement(sql1);
				pstmt.setString(1, ID);
				result1 = pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, ID);
			
			result2 = pstmt.executeUpdate();
			
			if(result1>0 && result2>0){
				result = true;
			}
				isSuccess=true;
			}catch(Exception e){
				System.out.println("IDdelete error : "+e);
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

	public MemberBean memberview(String ID) {// 회원정보 보기 action
		// TODO Auto-generated method stub
		String sql = "select * from member_info where member_ID=?";
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ID);
			rs = pstmt.executeQuery();
			rs.next();
			
			MemberBean mb = new MemberBean();
			mb.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
			mb.setMEMBER_ID(rs.getString("MEMBER_ID"));
			mb.setMEMBER_PWD(rs.getString("MEMBER_PWD"));
			mb.setMEMBER_ADDR_1(rs.getString("MEMBER_ADDR_1"));
			mb.setMEMBER_ADDR_2(rs.getString("MEMBER_ADDR_2"));
			mb.setMEMBER_ADDR_ZIP(rs.getString("MEMBER_ADDR_ZIP"));
			mb.setMEMBER_TEL(rs.getString("MEMBER_TEL"));
			mb.setMEMBER_GENDER(rs.getString("MEMBER_GENDER"));
			mb.setMEMBER_YEAR(rs.getInt("MEMBER_YEAR"));
			mb.setMEMBER_MONTH(rs.getInt("MEMBER_MONTH"));
			mb.setMEMBER_DAY(rs.getInt("MEMBER_DAY"));

			return mb;
		}catch(Exception e){
			System.out.println("memberview error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public MemberBean membermodifyview(String ID) {// 마이페이지 보기 action
		// TODO Auto-generated method stub
		String sql = "select * from member_info where member_ID=?";
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ID);
			rs = pstmt.executeQuery();
			rs.next();
			
			MemberBean mb = new MemberBean();
			mb.setMEMBER_ID(ID);
			mb.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
			mb.setMEMBER_ADDR_1(rs.getString("MEMBER_ADDR_1"));
			mb.setMEMBER_ADDR_2(rs.getString("MEMBER_ADDR_2"));
			mb.setMEMBER_ADDR_ZIP(rs.getString("MEMBER_ADDR_ZIP"));
			mb.setMEMBER_TEL(rs.getString("MEMBER_TEL"));
			mb.setMEMBER_GENDER(rs.getString("MEMBER_GENDER"));
			mb.setMEMBER_YEAR(rs.getInt("MEMBER_YEAR"));
			mb.setMEMBER_MONTH(rs.getInt("MEMBER_MONTH"));
			mb.setMEMBER_DAY(rs.getInt("MEMBER_DAY"));

			return mb;
		}catch(Exception e){
			System.out.println("memberview error : "+e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			if(con!=null)try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public int membermodify(String ID, MemberBean member) {// 마이페이지 수정 action
		// TODO Auto-generated method stub
		
		int result = -1;
		
		String sql = "update member_info set MEMBER_PWD=?,";
		sql+="member_addr_1=?, member_addr_2=?, member_addr_zip=?, member_tel=?, member_gender=? where member_ID=?";
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_PWD());
			pstmt.setString(2, member.getMEMBER_ADDR_1());
			pstmt.setString(3, member.getMEMBER_ADDR_2());
			pstmt.setString(4, member.getMEMBER_ADDR_ZIP());
			pstmt.setString(5, member.getMEMBER_TEL());
			pstmt.setString(6, member.getMEMBER_GENDER());
			pstmt.setString(7, ID);
			
			result = pstmt.executeUpdate();
			
			return result;
		}catch(Exception e){
			System.out.println("membermodify error : "+e);
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return result;
	}

	public int getListCount() {//총 회원 수
		// TODO Auto-generated method stub
		String sql = "select count(*) from member_info";
		int count = 0;
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			
			count = rs.getInt(1);
			
			
		}catch(Exception e){
			System.out.println("getListCount error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return count;
	}

	public List getMemberList(int page, int limit) {//회원 리스트
		// TODO Auto-generated method stub
		String sql = "select * from " +
		"(select rownum rnum, member_num, member_ID, member_name," + 
		"member_date from " +
		"(select * from member_info order by " +
		"member_date asc, member_ID asc, member_name asc)) " +
		"where rnum>=? and rnum<=?";
		List getMemberList = new ArrayList();
		
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, page);
			pstmt.setInt(2, limit);
			rs=pstmt.executeQuery();
			
			MemberBean mb = new MemberBean();
			mb.setMEMBER_NUM(rs.getInt("MEMBER_NUM"));
			mb.setMEMBER_ID(rs.getString("MEMBER_ID"));
			mb.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
			
			return null;
			
		}catch(Exception e){
			System.out.println("getMemberList error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	public int isoverlap(String id) {//아이디 중복체크
		String sql = "select * from member_info where member_id = ?";
		int result = 1;
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			
			if(rs.next()){
				result = 1;//이미 가입되어있는 아이디
			}else{
				result = 2;//가입가능
			}
			return result;
			
		}catch(Exception e){
			System.out.println("getMemberList error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return result;
	}
}
