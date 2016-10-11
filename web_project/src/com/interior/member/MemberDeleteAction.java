package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();

		MemberDAO_d memberdao = new MemberDAO_d();
		MemberBean member = new MemberBean();

		int result = 1;

		member.setMEMBER_NAME(request.getParameter("MEMBER_EMAIL"));
		member.setMEMBER_NAME(request.getParameter("MEMBER_PWD"));
		member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
		
		memberdao.emaildelete(member);

		if (result == 0) {

			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원탈퇴가 완료 되었습니다.');");
			out.println("location.href='./mainpage.html';");
			out.println("</script>");
			out.close();
			return null;
		} else if (result == -1) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('입력하신 정보가 일치하지 않습니다.');");
			out.println("</script>");
			out.close();
			return null;
		}
		System.out.println("회원탈퇴 시스템 오류");
		return null;
	}

}
