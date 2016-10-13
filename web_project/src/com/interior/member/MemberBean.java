package com.interior.member;

import java.sql.Date;

public class MemberBean {
	
	private String MEMBER_NAME;
	private String MEMBER_EMAIL;
	private String MEMBER_PWD;
	private String MEMBER_ADDR_1;
	private String MEMBER_ADDR_2;
	private String MEMBER_ADDR_ZIP;
	private String MEMBER_TEL;
	private String MEMBER_GENDER;
	private String MEMBER_BIRTH;
	private Date MEMBER_DATE;
	private int MEMBER_NUM;
	
	
	
	
	public int getMEMBER_NUM() {
		return MEMBER_NUM;
	}
	public void setMEMBER_NUM(int mEMBER_NUM) {
		MEMBER_NUM = mEMBER_NUM;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public String getMEMBER_EMAIL() {
		return MEMBER_EMAIL;
	}
	public void setMEMBER_EMAIL(String mEMBER_EMAIL) {
		MEMBER_EMAIL = mEMBER_EMAIL;
	}
	public String getMEMBER_PWD() {
		return MEMBER_PWD;
	}
	public void setMEMBER_PWD(String mEMBER_PWD) {
		MEMBER_PWD = mEMBER_PWD;
	}
	public String getMEMBER_ADDR_1() {
		return MEMBER_ADDR_1;
	}
	public void setMEMBER_ADDR_1(String mEMBER_ADDR_1) {
		MEMBER_ADDR_1 = mEMBER_ADDR_1;
	}
	public String getMEMBER_ADDR_2() {
		return MEMBER_ADDR_2;
	}
	public void setMEMBER_ADDR_2(String mEMBER_ADDR_2) {
		MEMBER_ADDR_2 = mEMBER_ADDR_2;
	}
	public String getMEMBER_ADDR_ZIP() {
		return MEMBER_ADDR_ZIP;
	}
	public void setMEMBER_ADDR_ZIP(String mEMBER_ADDR_ZIP) {
		MEMBER_ADDR_ZIP = mEMBER_ADDR_ZIP;
	}
	public String getMEMBER_TEL() {
		return MEMBER_TEL;
	}
	public void setMEMBER_TEL(String mEMBER_TEL) {
		MEMBER_TEL = mEMBER_TEL;
	}
	public String getMEMBER_GENDER() {
		return MEMBER_GENDER;
	}
	public void setMEMBER_GENDER(String mEMBER_GENDER) {
		MEMBER_GENDER = mEMBER_GENDER;
	}
	public String getMEMBER_BIRTH() {
		return MEMBER_BIRTH;
	}
	public void setMEMBER_BIRTH(String mEMBER_BIRTH) {
		MEMBER_BIRTH = mEMBER_BIRTH;
	}
	public Date getMEMBER_DATE() {
		return MEMBER_DATE;
	}
	public void setMEMBER_DATE(Date mEMBER_DATE) {
		MEMBER_DATE = mEMBER_DATE;
	}

}
