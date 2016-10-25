package com.interior.noti;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class NotiReplyDetailAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		  
		  request.setCharacterEncoding("utf-8");
		  ActionForward forward = new ActionForward();

		  NotiDAO notidao = new NotiDAO();
		  NotiBean notidata = new NotiBean();

		  int num = Integer.parseInt(request.getParameter("NOTI_REPLY_NUM"));
		  
		  notidao.setReadCountUpdate(num);//조회수 업데이트
		  notidata = notidao.getReplyDetail(num);//게시글 보기

		  if (notidata == null) {
		    System.out.println("공지사항 댓글 보기 시스템 에러");
		    return null;
		  }

		  System.out.println("공지사항 댓글 보기 성공");
		  
		  request.setAttribute("notidata", notidata);

		  forward.setRedirect(false);
		  forward.setPath("./noti/noti_detail.jsp");
		  
		  return forward;		
	}
}