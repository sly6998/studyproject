package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward();
		  
	    HttpSession session= null;
	    MemberDAO_d memberdao = new MemberDAO_d();
	    MemberBean member = new MemberBean();
	    
	    int result = -1;
	    
	    member.setMEMBER_EMAIL(request.getParameter("MEMBER_EMAIL"));
	    member.setMEMBER_PWD(request.getParameter("MEMBER_PWD"));
	    
	    result = memberdao.isMember(member);
	    System.out.println(result);
	    if(result == 0){
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out =response.getWriter();
	      out.println("<script>");
	      out.println("alert('비밀번호가 일치하지 않습니다.');");
	      out.println("location.href='./login.html';");
	      out.println("</script>");
	      out.close();
	      return null;
	    }else if(result == -1){
	      System.out.println("2");
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out =response.getWriter();
	      out.println("<script>");
	      out.println("alert('이메일이 존재하지 않습니다.');");
	      out.println("location.href='./login.html';");
	      out.println("</script>");
	      out.close();
	      return null;
	    }
	    //로그인 성공
	    session.setAttribute("id", member.getMEMBER_EMAIL());
	    System.out.println("로그인 성공");
	    forward.setRedirect(true);
	    forward.setPath("./mainpage.html");
	    return forward;
	}

}
