package com.interior.member;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class MemberFindIDAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		ActionForward forward = new ActionForward();

		MemberDAO memberdao = new MemberDAO();
		MemberBean member = new MemberBean();
		member.setMEMBER_NAME(request.getParameter("MEMBER_NAME"));
		member.setMEMBER_TEL(request.getParameter("MEMBER_TEL"));
		member.setMEMBER_YEAR(Integer.parseInt(request.getParameter("MEMBER_YEAR")));
		member.setMEMBER_MONTH(Integer.parseInt(request.getParameter("MEMBER_MONTH")));
		member.setMEMBER_DAY(Integer.parseInt(request.getParameter("MEMBER_DAY")));
		
		member = memberdao.IDfind(member);
		

		if (!(member.getMEMBER_ID().equals("")) || member.getMEMBER_ID() != null) {

			String ID = (String) member.getMEMBER_ID();

			/*response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원님의 ID은 '+ID+' 입니다.');");
			out.println("location.href='./mainpage.html';");
			out.println("</script>");
			out.close();*/
			forward.setRedirect(false);
			request.setAttribute("id", ID);
		    forward.setPath("./member/member_idfind_result.jsp");
			return forward;
		} else if (member.getMEMBER_ID().equals("")) {
			/*response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('가입되지 않은 회원정보 입니다.');");
			out.println("location.href='./mainpage.html';");
			out.println("</script>");
			out.close();*/
			System.out.println("aa");
			return null;
		}
		else{
		System.out.println("이메일 찾기 시스템 오류");
		}
		return null;
	}
}
