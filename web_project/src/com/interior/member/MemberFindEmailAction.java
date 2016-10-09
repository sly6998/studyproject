package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberFindEmailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();

		MemberDAO memberdao = new MemberDAO();
		MemberBean member = new MemberBean();

		int result = 1;

		member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
		member.setMEMBER_TEL(request.getParameter("MEMBER_TEL"));
		member.setMEMBER_BIRTH(request.getParameter("MEMBER_BIRTH"));
		
		
		memberdao.emailfind(member);

		if (result == 0) {

			String email = (String) request.getAttribute("MEMBER_EMAIL");

			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원님의 Email은 '+email+' 입니다.');");
			out.println("location.href='./login.html';");
			out.println("</script>");
			out.close();
			return null;
		} else if (result == -1) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('가입되지 않은 회원정보 입니다.');");
			out.println("location.href='./login.html';");
			out.println("</script>");
			out.close();
			return null;
		}
		System.out.println("이메일 찾기 오류");
		return null;
	}
}
