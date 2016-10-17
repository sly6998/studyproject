package com.interior.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;
import com.interior.noti.NotiBean;
import com.interior.noti.NotiDAO;

public class QnaDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 
		  request.setCharacterEncoding("utf-8");
		  ActionForward forward = new ActionForward();

		  QnaDAO qnadao = new QnaDAO();
		  QnaBean qnadata = new QnaBean();

		  int num = Integer.parseInt(request.getParameter("QNA_NUM"));
		  qnadao.setReadCountUpdate(num);//조회수 업데이트
		  qnadata = qnadao.getDetail(num);//게시글 보기

		  if (qnadata == null) {
		    System.out.println("질문게시판 상세보기 시스템 에러");
		    return null;
		  }

		  System.out.println("질문게시판 상세보기 성공");
		  
		  request.setAttribute("qnadata", qnadata);

		  forward.setRedirect(false);
		  forward.setPath("./qna/qna_detail.jsp");
		  
		  return forward;
	}

}
