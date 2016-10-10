package com.interior.member;

import java.util.List;

public class MemberDAO {

	public boolean joinMember(MemberBean member) {// 회원가입 action
		// TODO Auto-generated method stub
		return false;
	}

	public int isMember(MemberBean member) {// 로그인 action
		// TODO Auto-generated method stub
		return 0;
	}

	public void emailfind(MemberBean member) {// 이메일 찾기 action
		// TODO Auto-generated method stub

	}

	public void pwdfind(MemberBean member) {// 비밀번호 찾기 action
		// TODO Auto-generated method stub

	}

	public void emaildelete(MemberBean member) {// 회원탈퇴 action
		// TODO Auto-generated method stub

	}

	public MemberBean memberview(String email) {// 회원정보 보기 action
		// TODO Auto-generated method stub
		return null;
	}

	public MemberBean membermodifyview(String email) {// 마이페이지 보기 action
		// TODO Auto-generated method stub
		return null;
	}

	public void membermodify(String email, MemberBean member) {// 마이페이지 수정 action
		// TODO Auto-generated method stub

	}

	public int getListCount() {//총 회원 수
		// TODO Auto-generated method stub
		return 0;
	}

	public List getBoardList(int page, int limit) {//회원 리스트
		// TODO Auto-generated method stub
		return null;
	}
}
