package com.interior.reply;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;


public class NotiReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		NotiDAO notidao = new NotiDAO();
		NotiBean notidata = new NotiBean();
		
		int result = 0;
		
		replydata.setNotiNum
		
		return null;
	}

}
