package com.interior.noti;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class NotiDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 
		request.setCharacterEncoding("utf-8");
		  ActionForward forward = new ActionForward();

		  NotiDAO notidao = new NotiDAO();
		  NotiBean notidata = new NotiBean();

		  int num = Integer.parseInt(request.getParameter("NOTI_NUM"));
		  
		  notidao.setReadCountUpdate(num);//조회수 업데이트
		  notidata = notidao.getDetail(num);//게시글 보기

		  if (notidata == null) {
		    System.out.println("공지사항 상세보기 시스템 에러");
		    return null;
		  }

		  System.out.println("asdfasdf");
		  System.out.println("공지사항 상세보기 성공");
		  System.out.println("asdfasdfasdfasdf");
		  
		  request.setAttribute("notidata", notidata);

		  forward.setRedirect(false);
		  forward.setPath("./noti/noti_detail.jsp");
		  
		  return forward;
	}
}