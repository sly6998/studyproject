package com.interior.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.member.MemberDeleteAction;
import com.interior.member.MemberFindEmailAction;
import com.interior.member.MemberFindPWDAction;
import com.interior.member.MemberJoinAction;
import com.interior.member.MemberLoginAction;
import com.interior.member.MemberManagementAction;
import com.interior.member.MemberManagementModifyAction;
import com.interior.member.MemberModifyAction;
import com.interior.member.MemberModifyViewAction;
import com.interior.member.MemberViewAction;
import com.interior.noti.NotiDeleteAction;
import com.interior.noti.NotiDetailAction;
import com.interior.noti.NotiListAction;
import com.interior.noti.NotiModifyAction;
import com.interior.noti.NotiModifyViewAction;
import com.interior.noti.NotiWriteAction;
import com.interior.qna.QnaDeleteAction;
import com.interior.qna.QnaDetailAction;
import com.interior.qna.QnaListAction;
import com.interior.qna.QnaModifyAction;
import com.interior.qna.QnaModifyView;
import com.interior.qna.QnaWriteAction;
import com.interior.review.ReviewDeleteAction;
import com.interior.review.ReviewDetailAction;
import com.interior.review.ReviewListAction;
import com.interior.review.ReviewModifyAction;
import com.interior.review.ReviewModifyView;
import com.interior.review.ReviewWriteAction;

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

		
		
		
		
		/* Main */

		if (command.equals("/mainpage.html")) {// 메인페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./page/mainpage.jsp");

		} else if (command.equals("/login.html")) {// 로그인페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./page/login.jsp");

			
			
			
			
		/* MEMBER */

		} else if (command.equals("/join.html")) {// 회원가입 페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/member_join.jsp");

		} else if (command.equals("/emailfind.html")) {// 이메일 찾기 페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/member_find_email.jsp");

		} else if (command.equals("/pwdfind.html")) {// 비밀번호 찾기 페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/member_find_pw.jsp");

		} else if (command.equals("/memberdelete.html")) {// 회원탈퇴 페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/member_delete.jsp");

		} else if (command.equals("/member_modify.html")) {// 마이페이지 이동 & action
			action = new MemberModifyViewAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/member_view.html")) {// 회원정보 보기 페이지 이동 & action
			action = new MemberViewAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/member_management.html")) {// 회원관리 페이지 이동 & action(관리자)
			action = new MemberManagementAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/MemberJoinAction.html")) {// 회원가입 action
			action = new MemberJoinAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/MemberLoginAction.html")) {// 로그인 action
			action = new MemberLoginAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/MemberFindEmailAction.html")) {// 이메일 찾기 action
			action = new MemberFindEmailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (command.equals("/MemberFindPWDAction.html")) {// 비밀번호 찾기 action
			action = new MemberFindPWDAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (command.equals("/MemberDeleteAction.html")) {// 회원탈퇴 action
			action = new MemberDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/MemberModifyAction.html")) {// 마이페이지 수정 action
			action = new MemberModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/MemberManagementModify.html")) {// 회원정보 수정(관리자)
			action = new MemberManagementModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			
			
			/* 공지사항 */

		} else if (command.equals("/noti_list.html")){// 공지사항페이지 이동 & action
			action = new NotiListAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/noti_detail.html")) { // 공지사항 상세보기 페이지 이동 & action
			action = new NotiDetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/noti_write.html")) { // 공지사항 글 쓰기 페이지 이동(관리자)
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./noti/noti_write.jsp");
		} else if (command.equals("/noti_modify_view.html")) { // 공지사항 글 수정 페이지 이동 & action(관리자)
			action = new NotiModifyViewAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/NotiWriteAction.html")) {// 공지사항 글쓰기 페이지 이동 & action(관리자)
			action = new NotiWriteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/NotiModifyAction.html")) {// 공지사항 글 수정(관리자)
			action = new NotiModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/NotiDeleteAction.html")) {// 공지사항 글 삭제(관리자)
			action = new NotiDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			
			
			
			/* 카탈로그 */

		} else if (command.equals("/catalogue.html")) {// 카탈로그페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./catalogue/catalogue.jsp");

			
			
			
			
			/* 제품 */

		} else if (command.equals("/product_list.html")) {// 제품페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./product/product_list.jsp");

			
			
			
			
			/* 후기 */

		} else if (command.equals("/review_list.html")) {// review 게시판 이동 & action
			action = new ReviewListAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/review_detail.html")) {// review 게시판 상세보기 페이지 이동 & action
			action = new ReviewDetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/review_write.html")) {// review 게시판 글쓰기 페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./review/qna_write.jsp");
			
		} else if (command.equals("/ReviewWriteAction.html")) {// review 게시판 글쓰기 action
			action = new ReviewWriteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/review_modify.html")) {// review 게시판 글 수정 페이지 이동 & action
			action = new ReviewModifyView();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/ReviewModifyAction.html")) {// review 게시판 글 수정 action
			action = new ReviewModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/ReviewDeleteAction.html")) {// review 게시판 글 삭제 action
			action = new ReviewDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			
			
			
			/* 질문게시판 */

		} else if (command.equals("/qna_list.html")) {// 질문게시판 이동 & action
			action = new QnaListAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/qna_detail.html")) {// 질문게시판 상세보기 페이지 이동 & action
			action = new QnaDetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/qna_write.html")) {// 질문게시판 글쓰기 페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./qna/qna_write.jsp");
			
		} else if (command.equals("/QnaWriteAction.html")) {// 질문게시판 글쓰기 action
			action = new QnaWriteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/qna_modify.html")) {// 질문게시판 글 수정 페이지 이동 & action
			action = new QnaModifyView();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/QnaModifyAction.html")) {// 질문게시판 글 수정 action
			action = new QnaModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/QnaDeleteAction.html")) {// 질문게시판 글 삭제 action
			action = new QnaDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			

			
			
			
		/* 상담신청 */

		} else if (command.equals("/advice_request.html")) {// 상담신청페이지 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./advice/advice_request.jsp");

		
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
