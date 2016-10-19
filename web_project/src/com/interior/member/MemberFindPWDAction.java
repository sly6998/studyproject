package com.interior.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberFindPWDAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();

		MemberDAO memberdao = new MemberDAO();
		MemberBean member = new MemberBean();

		member.setMEMBER_ID(request.getParameter("MEMBER_ID"));
		member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
		member.setMEMBER_TEL(request.getParameter("MEMBER_TEL"));
		member.setMEMBER_YEAR(Integer.parseInt(request.getParameter("MEMBER_YEAR")));
		member.setMEMBER_MONTH(Integer.parseInt(request.getParameter("MEMBER_MONTH")));
		member.setMEMBER_DAY(Integer.parseInt(request.getParameter("MEMBER_DAY")));
		
		member = memberdao.pwdfind(member);

		if (!(member.getMEMBER_PWD().equals("")) || member.getMEMBER_PWD() != null) {

			String pwd = (String) member.getMEMBER_PWD();

			forward.setRedirect(false);
			request.setAttribute("pwd", pwd);
		    forward.setPath("./member/member_pwdfind_result.jsp");
			return forward;
		} else if (member.getMEMBER_PWD().equals("")) {
			forward.setRedirect(true);
		    forward.setPath("./member/member_pwdfind_result.jsp");
			return forward;
		}
		else{
		System.out.println("패스워드 찾기 시스템 오류");
		}
		return null;
	}
}