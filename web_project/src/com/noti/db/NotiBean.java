package com.noti.db;

import java.sql.Date;

public class NotiBean {

	private String NOTI_MEMBER_EMAIL;
	private String NOTI_MEMBER_NAME;
	private String NOTI_SUBJECT;
	private String NOTI_CONTENT;
	private int NOTI_READCOUNT;
	private Date NOTI_DATE;
	private int NOTI_NUM;
	private String NOTI_FILE;
	
	
	public String getNOTI_MEMBER_EMAIL() {
		return NOTI_MEMBER_EMAIL;
	}
	public void setNOTI_MEMBER_EMAIL(String nOTI_MEMBER_EMAIL) {
		NOTI_MEMBER_EMAIL = nOTI_MEMBER_EMAIL;
	}
	public String getNOTI_MEMBER_NAME() {
		return NOTI_MEMBER_NAME;
	}
	public void setNOTI_MEMBER_NAME(String nOTI_MEMBER_NAME) {
		NOTI_MEMBER_NAME = nOTI_MEMBER_NAME;
	}
	public String getNOTI_SUBJECT() {
		return NOTI_SUBJECT;
	}
	public void setNOTI_SUBJECT(String nOTI_SUBJECT) {
		NOTI_SUBJECT = nOTI_SUBJECT;
	}
	public String getNOTI_CONTENT() {
		return NOTI_CONTENT;
	}
	public void setNOTI_CONTENT(String nOTI_CONTENT) {
		NOTI_CONTENT = nOTI_CONTENT;
	}
	public int getNOTI_READCOUNT() {
		return NOTI_READCOUNT;
	}
	public void setNOTI_READCOUNT(int nOTI_READCOUNT) {
		NOTI_READCOUNT = nOTI_READCOUNT;
	}
	public Date getNOTI_DATE() {
		return NOTI_DATE;
	}
	public void setNOTI_DATE(Date nOTI_DATE) {
		NOTI_DATE = nOTI_DATE;
	}
	public int getNOTI_NUM() {
		return NOTI_NUM;
	}
	public void setNOTI_NUM(int nOTI_NUM) {
		NOTI_NUM = nOTI_NUM;
	}
	public String getNOTI_FILE() {
		return NOTI_FILE;
	}
	public void setNOTI_FILE(String nOTI_FILE) {
		NOTI_FILE = nOTI_FILE;
	}
}
