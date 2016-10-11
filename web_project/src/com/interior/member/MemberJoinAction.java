package com.interior.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;



public class MemberJoinAction implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");

	    ActionForward forward = new ActionForward();
	    
	    MemberDAO memberdao = new MemberDAO();
	    MemberBean member = new MemberBean();
	    
	    
	    boolean result = false;
	    System.out.println(request.getParameter("MEMBER_NAME"));
	    System.out.println(request.getParameter("MEMBER_EMAIL"));
	    
	    	
	    member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
	    member.setMEMBER_EMAIL(request.getParameter("MEMBER_EMAIL"));
	    member.setMEMBER_PWD(request.getParameter("MEMBER_PWD"));
	    member.setMEMBER_ADDR_1(request.getParameter("MEMBER_ADDR_1"));
	    member.setMEMBER_ADDR_2(request.getParameter("MEMBER_ADDR_2"));
	    member.setMEMBER_ADDR_ZIP(request.getParameter("MEMBER_ADDR_ZIP"));
	    member.setMEMBER_TEL(request.getParameter("MEMBER_TEL"));
	    member.setMEMBER_GENDER(request.getParameter("MEMBER_GENDER"));
	    member.setMEMBER_BIRTH(request.getParameter("MEMBER_BIRTH"));
	    System.out.println("2");
	    System.out.println(member.getMEMBER_EMAIL());
	    System.out.println(member.getMEMBER_NAME());
	    

	    result = memberdao.joinMember(member);
	    
	    if(result == false){
	      System.out.println("회원가입 실패");
	      return null;
	    }
	    
	    //회원가입 성공
	    forward.setRedirect(true);
	    forward.setPath("./login.html");
	    return forward;
	}
}