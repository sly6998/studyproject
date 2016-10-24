package com.interior.noti;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class NotiReplyWriteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		
		NotiDAO notidao = new NotiDAO();
		NotiBean notidata = new NotiBean();
		int result=0;
		
		notidata.setNOTI_REPLY_NUM(Integer.parseInt(request.getParameter("NOTI_REPLY_NUM")));
		notidata.setNOTI_REPLY_MEMBER_NAME(request.getParameter("NOTI_REPLY_MEMBER_NAME"));
		notidata.setNOTI_REPLY_CONTENT(request.getParameter("NOTI_REPLY_CONTENT"));
		notidata.setNOTI_REPLY_REF(Integer.parseInt(request.getParameter("NOTI_REPLY_REF")));
		notidata.setNOTI_REPLY_SEQ(Integer.parseInt(request.getParameter("NOTI_REPLY_SEQ")));
		notidata.setNOTI_REPLY_LEV(Integer.parseInt(request.getParameter("NOTI_REPLY_LEV")));
		
		result = notidao.NotiReplyWrite(notidata);
		
		if(result==0){
			System.out.println("NotiReplyWriteAction failed");
			return null;
		}
		System.out.println("NotiReplyWriteAction completed!");
		
		forward.setRedirect(true);
		forward.setPath("./NotiDetailAction.bo?num="+result);
		return forward;
	}
}