package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();

		MemberDAO memberdao = new MemberDAO();
		MemberBean member = new MemberBean();


		String email = (String) request.getParameter("MEMBER_EMAIL");

		member = memberdao.memberview(email);

		if (member == null) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('시스템 오류. 관리자에게 연락바람');");
			out.println("</script>");
			out.close();
			return null;
		}

		System.out.println("회원정보 보기 성공");

		request.setAttribute("boarddata", member);

		forward.setRedirect(false);
		forward.setPath("./member/member_view.jsp");

		return forward;
	}
}
