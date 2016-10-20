<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  String MEMBER_ID = null;
  String MEMBER_NAME = null;
  String MEMBER_TEL = null;
  if (session.getAttribute("MEMBER_ID") != null) {
  MEMBER_ID =(String)session.getAttribute("MEMBER_ID");
  MEMBER_TEL =(String)session.getAttribute("MEMBER_TEL");
  }
  
  if (session.getAttribute("MEMBER_NAME") != null) {
  MEMBER_NAME =(String)session.getAttribute("MEMBER_NAME");
	  
  }
    %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/grid.css" type="text/css" media="screen">   
    <script src="<%=request.getContextPath()%>/js/jquery-1.6.2.min.js" type="text/javascript"></script>     
	<!--[if lt IE 7]>
        <div style=' clear: both; text-align:center; position: relative;'>
            <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"  alt="" /></a>
        </div>
	<![endif]-->
    <!--[if lt IE 9]>
   		<script type="text/javascript" src="js/html5.js"></script>
        <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen">
	<![endif]-->
</head>
<body id="page5">
	<%@ include file="../page/header.jsp"%>
    <section id="content">
        <div class="bg-top">
        	<div class="bg-top-2">
                <div class="bg">
                    <div class="bg-top-shadow">
                        <div class="main">
                            <div class="box">
                                <div class="padding">
                                    <div class="container_12">
                                        <div class="wrapper">
                                            <div class="grid_12">
                                            	<div class="indent-left">
                                                	<h3 class="p2">Contact Form</h3>
                                                    
<form id="contact-form" method="post" enctype="multipart/form-data">                    
<fieldset>
                                                        

<input type="hidden" name="ADVICE_MEMBER_ID" value="<%=MEMBER_ID %>"/>
<input type="hidden" name="ADVICE_MEMBER_NAME" value="<%=MEMBER_NAME %>"/>
<input type="hidden" name="ADVICE_MEMBER_TEL" value="<%=MEMBER_TEL %>"/>

<label><span class="text-form">아 이 디:</span>  <%= MEMBER_ID %> </label>
<label><span class="text-form">이    름:</span> <%=MEMBER_NAME %> </label>   
<label><span class="text-form">전화번호:</span> <%=MEMBER_TEL %> </label>  
                                  

 <label><span class="text-form">상담방법:</span>
		<select >
			<option>--------</option>
			<option>방문상담</option>
			<option>전화상담</option>
		</select>
</label>                                    
<label><span class="text-form">날    짜:</span> - </label>                                    
<div class="wrapper">
	<div class="text-form">Message:</div>
	<textarea name="ADVICE_CONTENT" id="contents"></textarea>
</div>
<div class="buttons">
	<a class="button" href="#" onClick="document.getElementById('contact-form').reset()">Clear</a>
	<a class="button" href="#" onClick="document.getElementById('contact-form').submit()">Send</a>
</div>    
                      
</fieldset>						
</form>                          
                                                       
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>	
        </div>
     
</body>
</html>