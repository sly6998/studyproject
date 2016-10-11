package com.interior.noti;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class NotiWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		  
		request.setCharacterEncoding("utf-8");
		  ActionForward forward = new ActionForward();
		  NotiDAO notidao = new NotiDAO();
		  NotiBean notidata = new NotiBean();

		  //String realFolder = "";
		  //String savaFolder = "/boardupload";
		  //int fileSize = 5 * 1024 * 1024;

		  //realFolder = request.getSession().getServletContext().getRealPath(savaFolder);

		  boolean result = false;

		  try {
		    //MultipartRequest multi = null;
		    //multi = new MultipartRequest(request, realFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());

		    notidata.setNOTI_MEMBER_EMAIL((String)request.getParameter("MEMBER_ID"));
		    notidata.setNOTI_SUBJECT((String)request.getParameter("BOARD_SUBJECT"));
		    notidata.setNOTI_CONTENT((String)request.getParameter("BOARD_CONTENT"));

		    result = notidao.notiInsert(notidata);

		    if (result == false) {
		      System.out.println("게시판 등록 시스템 에러");
		      return null;
		    }

		    System.out.println("게시판 등록 완료");

		    forward.setRedirect(true);
		    forward.setPath("./noti/noti_write.html");
		    return forward;
		  } catch (Exception e) {
		    e.printStackTrace();
		  }
		  return null;
	}

}
