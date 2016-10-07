package com.reply.db;

import java.sql.Date;

public class ReplyBean {

	private String REPLY_BOARD;
	private String REPLY_MEMBER_EMAIL;
	private String REPLY_MEMBER_NAME;
	private String REPLY_CONTENT;
	private Date REPLY_DATE;
	private int REPLY_SEQ;
	private int REPLY_REF;
	private int REPLY_LEV;
	
	
	public String getREPLY_BOARD() {
		return REPLY_BOARD;
	}
	public void setREPLY_BOARD(String rEPLY_BOARD) {
		REPLY_BOARD = rEPLY_BOARD;
	}
	public String getREPLY_MEMBER_EMAIL() {
		return REPLY_MEMBER_EMAIL;
	}
	public void setREPLY_MEMBER_EMAIL(String rEPLY_MEMBER_EMAIL) {
		REPLY_MEMBER_EMAIL = rEPLY_MEMBER_EMAIL;
	}
	public String getREPLY_MEMBER_NAME() {
		return REPLY_MEMBER_NAME;
	}
	public void setREPLY_MEMBER_NAME(String rEPLY_MEMBER_NAME) {
		REPLY_MEMBER_NAME = rEPLY_MEMBER_NAME;
	}
	public String getREPLY_CONTENT() {
		return REPLY_CONTENT;
	}
	public void setREPLY_CONTENT(String rEPLY_CONTENT) {
		REPLY_CONTENT = rEPLY_CONTENT;
	}
	public Date getREPLY_DATE() {
		return REPLY_DATE;
	}
	public void setREPLY_DATE(Date rEPLY_DATE) {
		REPLY_DATE = rEPLY_DATE;
	}
	public int getREPLY_SEQ() {
		return REPLY_SEQ;
	}
	public void setREPLY_SEQ(int rEPLY_SEQ) {
		REPLY_SEQ = rEPLY_SEQ;
	}
	public int getREPLY_REF() {
		return REPLY_REF;
	}
	public void setREPLY_REF(int rEPLY_REF) {
		REPLY_REF = rEPLY_REF;
	}
	public int getREPLY_LEV() {
		return REPLY_LEV;
	}
	public void setREPLY_LEV(int rEPLY_LEV) {
		REPLY_LEV = rEPLY_LEV;
	}
}
