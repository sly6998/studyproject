package com.interior.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.member.*;


@WebServlet("/ForntController")
public class FrontController extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
  private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		
		
		/* Move */
		
		if (command.equals("/mainpage.html")) {//메인페이지 이동
		  forward = new ActionForward();
		  forward.setRedirect(false);
		  forward.setPath("./page/mainpage.jsp");

		} else if (command.equals("/login.html")) {//로그인페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./page/login.jsp");

		}else if (command.equals("/join.html")) {//회원가입 페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./member/member_join.jsp");

		}else if (command.equals("/emailfind.html")) {//이메일 찾기 페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./member/member_find_email.jsp");

		}else if (command.equals("/pwdfind.html")) {//비밀번호 찾기 페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./member/member_find_pw.jsp");

		}else if (command.equals("/memberdelete.html")) {//회원탈퇴 페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./member/member_delete.jsp");

		}else if (command.equals("/member_modify.html")) {//마이페이지 이동 & action
			action = new MemberModifyViewAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		}else if (command.equals("/member_view.html")) {//회원정보 보기 페이지 이동 & action
			action = new MemberViewAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		}else if (command.equals("/member_management.html")) {//회원관리 페이지 이동 & action(관리자)
			action = new MemberManagementAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		}else if (command.equals("/noti_list.html")) {//공지사항페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./noti/noti_list.jsp");
		
		} else if (command.equals("/catalogue.html")) {//카탈로그페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./catalogue/catalogue.jsp");
		
		} else if (command.equals("/product_list.html")) {//제품페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./product/product_list.jsp");
		
		} else if (command.equals("/review_list.html")) {//후기페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./review/review_list.jsp");
		
		} else if (command.equals("/qna_list.html")) {//질문게시판 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./qnaboard/qna_list.jsp");
		
		} else if (command.equals("/advice_request.html")) {//상담신청페이지 이동
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./advice/advice_request.jsp");

			  
			  
		/* Action */	  
			  
		} else if (command.equals("/MemberJoinAction.html")) {//회원가입 action
			action = new MemberJoinAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		}  else if (command.equals("/MemberLoginAction.html")) {//로그인 action
			action = new MemberLoginAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		} else if (command.equals("/MemberFindEmailAction.html")) {//이메일 찾기 action
			action = new MemberFindEmailAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }

		} else if (command.equals("/MemberFindPWDAction.html")) {//비밀번호 찾기 action
			action = new MemberFindPWDAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }

		} else if (command.equals("/MemberDeleteAction.html")) {//회원탈퇴 action
			action = new MemberDeleteAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		} else if (command.equals("/MemberModifyAction.html")) {//마이페이지 수정 action
			action = new MemberModifyAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		} else if (command.equals("/MemberManagementModify.html")) {//회원정보 수정(관리자)
			action = new MemberManagementModifyAction();
		      try {
		       forward = action.execute(request, response);
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		}

		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  System.out.println("get방식");
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  System.out.println("post방식");
		doProcess(request, response);
	}

}
