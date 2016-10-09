package com.interior.advice;

import java.sql.Date;

public class AdviceBean {

	private String ADVICE_MEMBER_EMAIL;
	private String ADVICE_MEMBER_NAME;
	private String ADVICE_MEMBER_TEL;
	private String ADVICE_CONTENT;
	private Date ADVICE_DATE;
	
	
	public String getADVICE_MEMBER_EMAIL() {
		return ADVICE_MEMBER_EMAIL;
	}
	public void setADVICE_MEMBER_EMAIL(String aDVICE_MEMBER_EMAIL) {
		ADVICE_MEMBER_EMAIL = aDVICE_MEMBER_EMAIL;
	}
	public String getADVICE_MEMBER_NAME() {
		return ADVICE_MEMBER_NAME;
	}
	public void setADVICE_MEMBER_NAME(String aDVICE_MEMBER_NAME) {
		ADVICE_MEMBER_NAME = aDVICE_MEMBER_NAME;
	}
	public String getADVICE_MEMBER_TEL() {
		return ADVICE_MEMBER_TEL;
	}
	public void setADVICE_MEMBER_TEL(String aDVICE_MEMBER_TEL) {
		ADVICE_MEMBER_TEL = aDVICE_MEMBER_TEL;
	}
	public String getADVICE_CONTENT() {
		return ADVICE_CONTENT;
	}
	public void setADVICE_CONTENT(String aDVICE_CONTENT) {
		ADVICE_CONTENT = aDVICE_CONTENT;
	}
	public Date getADVICE_DATE() {
		return ADVICE_DATE;
	}
	public void setADVICE_DATE(Date aDVICE_DATE) {
		ADVICE_DATE = aDVICE_DATE;
	}
}
