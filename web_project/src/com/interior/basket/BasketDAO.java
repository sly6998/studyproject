package com.interior.basket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.interior.advice.AdviceBean;


public class BasketDAO {
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	public BasketDAO(){
		try{
			Context init = new InitialContext();
			ds=(DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e){
			System.out.println("DB connection failed : "+e);
			return;
		}
	}

	public int getListCount() {  //총 basket 리스트 수
		// TODO Auto-generated method stub
		int count = 0;
		
		try{
			con = ds.getConnection();
			pstmt = con.prepareStatement("select count(*) from basket");
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

	public List getBasketList(int page, int limit) {//Basket 리스트 불러오기
		// TODO Auto-generated method stub
		String sql = "select * from Basket " +
		"(select rownum rnum, Basket_member_email, Basket_member_name, Basket_member_tel, Basket_content, Basket_date from " +
		"(select * from Basket order by " +
		"Basket_date desc)) " +
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
				BasketBean basket = new BasketBean();
				basket.setBASKET_MEMBER_ID(rs.getString("BASKET_MEMBER_EMAIL"));
				basket.setBASKET_MEMBER_NAME(rs.getString("BASKET_MEMBER_NAME"));
				basket.setBASKET_DATE(rs.getDate("BASKET_DATE"));
				list.add(basket);
			}
			
			return list;
		}catch(Exception e){
			System.out.println("getBasketList error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}
	
	public BasketBean getDetail(int num) throws Exception {  //Basket 상세보기
		// TODO Auto-generated method stub
		BasketBean basket = null;
		String sql = "select * from basket where advice_num=?";
		pstmt.setInt(1, num);
		try{
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				basket = new BasketBean();
			
				basket.setBASKET_MEMBER_ID(rs.getString("ADVICE_MEMBER_EMAIL"));
				basket.setBASKET_MEMBER_NAME(rs.getString("ADVICE_MEMBER_NAME"));
				
				
				basket.setBASKET_DATE(rs.getDate("ADVICE_DATE"));
			}
			return basket;
		}catch(Exception e){
			System.out.println("getBasketDetail error : "+e);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(con!=null) try{con.close();}catch(SQLException ex){}
		}
		return null;
	}

	
	
	
}
