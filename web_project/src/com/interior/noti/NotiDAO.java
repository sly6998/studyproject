package com.interior.noti;

import java.util.List;

public class NotiDAO {

	public int getListCount() {//총 게시판 리스트 수
		// TODO Auto-generated method stub
		return 0;
	}

	public List getNotiList(int page, int limit) {//게시판 리스트를 받아옴
		// TODO Auto-generated method stub
		return null;
	}

	public void setReadCountUpdate(int num) {//공지사항 조회수 업데이트
		// TODO Auto-generated method stub
		
	}

	public NotiBean getDetail(int num) {//공지사항 글 보기(상세보기)
		// TODO Auto-generated method stub
		return null;
	}

	public boolean notiInsert(NotiBean notidata) {//공지사항 글쓰기(관리자)
		// TODO Auto-generated method stub
		return false;
	}

	public NotiBean notimodifyview(int num) {//공지사항 수정할 글 불러오기(관리자)
		// TODO Auto-generated method stub
		return null;
	}

	public boolean boardModify(NotiBean notidata) {//공지사항 수정 action(관리자)
		// TODO Auto-generated method stub
		return false;
	}

	public boolean notidelete(int num) {//공지사항 글 삭제 action(관리자)
		// TODO Auto-generated method stub
		return false;
	}

}
