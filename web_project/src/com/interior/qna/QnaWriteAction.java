package com.interior.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.interior.controller.Action;
import com.interior.controller.ActionForward;

public class QnaWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		QnaDAO qnadao = new QnaDAO();
		QnaBean qnadata = new QnaBean();

		boolean result = false;

		try {

			qnadata.setQnA_MEMBER_ID("QNA_MEMBER_ID");
			qnadata.setQnA_SUBJECT("QNA_SUBJECT");
			qnadata.setQnA_CONTENT("QNA_CONTENT");

			result = qnadao.qnaInsert(qnadata);

			if (result == false) {
				System.out.println("질문 게시판 등록 시스템 에러");
				return null;
			}

			System.out.println("질문 게시판 등록 완료");

			forward.setRedirect(true);
			forward.setPath("./qna/qna_write.html");
			return forward;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}