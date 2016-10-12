package com.interior.qna;

import java.util.List;

public class QnaDAO {

	public int getListCount() {//qna 게시판 리스트의 총 개시글 수 구하기 
		// TODO Auto-generated method stub
		return 0;
	}

	public List getQnaList(int page, int limit) {//qna 게시글 불러오기
		// TODO Auto-generated method stub
		return null;
	}

	public void setReadCountUpdate(int num) {//qna 게시글 조회수 업데이트
		// TODO Auto-generated method stub
		
	}

	public QnaBean getDetail(int num) {//qna 게시글 상세보기
		// TODO Auto-generated method stub
		return null;
	}

	public boolean qnaInsert(QnaBean qnadata) {//qna 글쓰기 action
		// TODO Auto-generated method stub
		return false;
	}

	public QnaBean qnamodifyView(int num) {//qna 게시글 수정 페이지
		// TODO Auto-generated method stub
		return null;
	}

	public boolean qnaModify(QnaBean qnadata) {//qna 게시글 수정 action
		// TODO Auto-generated method stub
		return false;
	}

	public boolean qnadelete(int num) {//qna 게시글 삭제 action
		// TODO Auto-generated method stub
		return false;
	}

}
