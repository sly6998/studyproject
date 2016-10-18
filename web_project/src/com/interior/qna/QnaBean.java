package com.interior.qna;

import java.sql.Date;

public class QnaBean {

	private String QnA_MEMBER_ID;
	private String QnA_MEMBER_NAME;
	private int QnA_NUM;
	private String QnA_SUBJECT;
	private String QnA_CONTENT;
	private Date QnA_DATE;
	private int QnA_SEQ;
	private int QnA_REF;
	private int QnA_LEV;
	private int QnA_READCOUNT;
	
	
	public String getQnA_MEMBER_ID() {
		return QnA_MEMBER_ID;
	}
	public void setQnA_MEMBER_ID(String qnA_MEMBER_ID) {
		QnA_MEMBER_ID = qnA_MEMBER_ID;
	}
	public String getQnA_MEMBER_NAME() {
		return QnA_MEMBER_NAME;
	}
	public void setQnA_MEMBER_NAME(String qnA_MEMBER_NAME) {
		QnA_MEMBER_NAME = qnA_MEMBER_NAME;
	}
	public int getQnA_NUM() {
		return QnA_NUM;
	}
	public void setQnA_NUM(int qnA_NUM) {
		QnA_NUM = qnA_NUM;
	}
	public String getQnA_SUBJECT() {
		return QnA_SUBJECT;
	}
	public void setQnA_SUBJECT(String qnA_SUBJECT) {
		QnA_SUBJECT = qnA_SUBJECT;
	}
	public String getQnA_CONTENT() {
		return QnA_CONTENT;
	}
	public void setQnA_CONTENT(String qnA_CONTENT) {
		QnA_CONTENT = qnA_CONTENT;
	}
	public Date getQnA_DATE() {
		return QnA_DATE;
	}
	public void setQnA_DATE(Date qnA_DATE) {
		QnA_DATE = qnA_DATE;
	}
	public int getQnA_SEQ() {
		return QnA_SEQ;
	}
	public void setQnA_SEQ(int qnA_SEQ) {
		QnA_SEQ = qnA_SEQ;
	}
	public int getQnA_REF() {
		return QnA_REF;
	}
	public void setQnA_REF(int qnA_REF) {
		QnA_REF = qnA_REF;
	}
	public int getQnA_LEV() {
		return QnA_LEV;
	}
	public void setQnA_LEV(int qnA_LEV) {
		QnA_LEV = qnA_LEV;
	}
	public int getQnA_READCOUNT() {
		return QnA_READCOUNT;
	}
	public void setQnA_READCOUNT(int qnA_READCOUNT) {
		QnA_READCOUNT = qnA_READCOUNT;
	}
}
