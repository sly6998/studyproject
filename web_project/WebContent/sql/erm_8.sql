
/* Drop Tables */

DROP TABLE ADVICE CASCADE CONSTRAINTS;
DROP TABLE BASKET CASCADE CONSTRAINTS;
DROP TABLE ITEM CASCADE CONSTRAINTS;
DROP TABLE MEMBER_INFO CASCADE CONSTRAINTS;
DROP TABLE NOTI CASCADE CONSTRAINTS;
DROP TABLE ORDER_LIST CASCADE CONSTRAINTS;
DROP TABLE QnA_BOARD CASCADE CONSTRAINTS;
DROP TABLE REPLY CASCADE CONSTRAINTS;
DROP TABLE REVIEW CASCADE CONSTRAINTS;


/* Select Tables */

Select * from advice;
Select * from basket;
Select * from item;
Select * from member_info;
Select * from noti;
Select * from order_list;
Select * from qna_board;
Select * from reply;
Select * from review;


/* Create Tables */

CREATE TABLE ADVICE
(
	ADVICE_NUM number(10),
	ADVICE_MEMBER_ID varchar2(15),
	ADVICE_MEMBER_NAME varchar2(20),
	ADVICE_MEMBER_TEL varchar2(20),
	ADVICE_CONTENT varchar2(2000),
	ADVICE_DATE date
);


CREATE TABLE BASKET
(
	BASKET_MEMBER_ID varchar2(15),
	BASKET_MEMBER_NAME varchar2(20),
	BASKET_ITEM_NAME varchar2(50),
	BASKET_ITEM_PRICE varchar2(10),
	BASKET_ITEM_IMAGE varchar2(50),
	BASKET_ITEM_BRAND varchar2(50),
	BASKET_DATE date,
	BASKET_AMOUNT number(5),
	BASKET_RESULT number(10),
	BASKET_ITEM_MODEL varchar2(200)
);


CREATE TABLE ITEM
(
	ITEM_MODEL varchar2(50),
	ITEM_NAME varchar2(50),
	ITEM_PRICE number(10),
	ITEM_IMAGE varchar2(50),
	ITEM_TYPE varchar2(20),
	ITEM_BRAND varchar2(50),
	ITEM_CONTENT varchar2(2000)
);


CREATE TABLE MEMBER_INFO
(
	MEMBER_NAME varchar2(20),
	MEMBER_ID varchar2(15),
	MEMBER_PWD varchar2(30),
	MEMBER_ADDR_1 varchar2(100),
	MEMBER_ADDR_2 varchar2(100),
	MEMBER_ADDR_ZIP varchar2(10),
	MEMBER_TEL varchar2(20),
	MEMBER_GENDER varchar2(6),
	MEMBER_YEAR number(4),
	MEMBER_MONTH number(2),
	MEMBER_DAY number(2),
	MEMBER_NUM number(10)
	MEMBER_DATE date,
);

insert into MEMBER_INFO (MEMBER_NAME, MEMBER_ID, MEMBER_PWD, MEMBER_NUM, MEMBER_DATE) values('관리자', 'admin', 'admin',member_info_seq.nextval,sysdate);
delete from member_info where member_id='user01';

CREATE TABLE NOTI
(
	NOTI_MEMBER_ID varchar2(15),
	NOTI_SUBJECT varchar2(100),
	NOTI_CONTENT varchar2(2000),
	NOTI_READCOUNT number(5),
	NOTI_DATE date,
	NOTI_NUM number(10)
);


CREATE TABLE ORDER_LIST
(
	ORDER_MEMBER_ID varchar2(15),
	ORDER_ITEM_MODEL varchar2(200),
	ORDER_ITEM_NAME varchar2(50),
	ORDER_ITEM_AMOUNT number(5),
	ORDER_ITEM_PRICE_SUM number(10),
	ORDER_ITEM_BRAND varchar2(50),
	ORDER_MEMBER_NAME varchar2(20),
	ORDER_MEMBER_TEL varchar2(20),
	ORDER_MEMBER_ZIP varchar2(10),
	ORDER_MEMBER_ADDR_1 varchar2(50),
	ORDER_MEMBER_ADDR_2 varchar2(50),
	ORDER_NAME varchar2(20),
	ORDER_TEL varchar2(20),
	ORDER_ZIP varchar2(10),
	ORDER_ADDR_1 varchar2(50),
	ORDER_ADDR_2 varchar2(50),
	ORDER_MEMO varchar2(500),
	ORDER_TRADE_TYPE varchar2(20),
	ORDER_TRADE_PAYER varchar2(20),
	ORDER_DATE date,
	ORDER_STATUS varchar2(10),
	ORDER_TRADE_NUM varchar2(50)
);


CREATE TABLE QnA_BOARD
(
	QnA_MEMBER_ID varchar2(15),
	QnA_MEMBER_NAME varchar2(20),
	QnA_NUM number(10),
	QnA_SUBJECT varchar2(50),
	QnA_CONTENT varchar2(2000),
	QnA_DATE date,
	QnA_SEQ number(5),
	QnA_REF number(5),
	QnA_LEV number(5),
	QnA_READCOUNT number(10)
);


CREATE TABLE REPLY
(
	REPLY_BOARD varchar2(10),
	REPLY_MEMBER_ID varchar2(35),
	REPLY_MEMBER_NAME varchar2(20),
	REPLY_CONTENT varchar2(200),
	REPLY_DATE date,
	REPLY_SEQ number,
	REPLY_REF number,
	REPLY_LEV number
);


CREATE TABLE REVIEW
(
	REVIEW_MEMBER_ID varchar2(20),
	REVIEW_MEMBER_NAME varchar2(20),
	REVIEW_SUBJECT varchar2(100),
	REVIEW_CONTENT varchar2(2000),
	REVIEW_READCOUNT number(10),
	REVIEW_DATE date,
	REVIEW_NUM number(10)
);


/* Create Sequence(시퀀스 생성) */

create sequence member_info_seq start with 1 increment by 1
create sequence noti_seq start with 1 increment by 1
create sequence review_seq start with 1 increment by 1
create sequence qna_board_seq start with 1 increment by 1
/*seq 생성...삭제 해주세요 이 글*/



/* drop sequence(시퀀스 삭제)*/

drop sequence member_info_seq;
drop sequence noti_seq;
drop sequence review_seq;
drop sequence qna_board_seq;