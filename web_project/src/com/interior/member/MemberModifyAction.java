package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();
		HttpSession session = null;
		
		MemberDAO memberdao = new MemberDAO();
		MemberBean member = new MemberBean();

		String email = (String)session.getAttribute("MEMBER_EMAIL");
	
		
		int result = 1;

	    member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
	    member.setMEMBER_PWD(request.getParameter("MEMBER_PWD"));
	    member.setMEMBER_ADDR_1(request.getParameter("MEMBER_ADDR_1"));
	    member.setMEMBER_ADDR_2(request.getParameter("MEMBER_ADDR_2"));
	    member.setMEMBER_ADDR_ZIP(request.getParameter("MEMBER_ADDR_ZIP"));
	    member.setMEMBER_TEL(request.getParameter("MEMBER_TEL"));
	    member.setMEMBER_GENDER(request.getParameter("MEMBER_GENDER"));
	    member.setMEMBER_BIRTH(request.getParameter("MEMBER_BIRTH"));
		
		
		memberdao.membermodify(email, member);

		if (result == 0) {

			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원정보가 수정되었습니다.');");
			out.println("location.href='./mainpage.html';");
			out.println("</script>");
			out.close();
			return null;
		} else if (result == -1) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('정보를 올바르게 입력하여 주세요.');");
			out.println("</script>");
			out.close();
			return null;
		}
		System.out.println("회원정보 수정 시스템 오류");
		return null;
	}
}
