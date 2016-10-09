package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberFindPWD implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();

		MemberDAO memberdao = new MemberDAO();
		MemberBean member = new MemberBean();

		int result = 1;

		member.setMEMBER_EMAIL(request.getParameter("MEMBER_EMAIL"));
		member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
		member.setMEMBER_TEL(request.getParameter("MEMBER_TEL"));
		member.setMEMBER_BIRTH(request.getParameter("MEMBER_BIRTH"));
		
		
		memberdao.pwdfind(member);

		if (result == 0) {

			String pwd = (String) request.getAttribute("MEMBER_PWD");

			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원님의 비밀번호는 '+pwd+' 입니다.');");
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
		System.out.println("비밀번호 찾기 오류");
		return null;
	}
}