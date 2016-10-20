<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  String MEMBER_ID = null;


  if (session.getAttribute("MEMBER_ID") != null) {
  MEMBER_ID =(String)session.getAttribute("MEMBER_ID");
 
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
                                                    
<form id="contact-form" method="post" action="./AdviceWriteAction.html">                    
<fieldset>
              
<label><div class="text-form">Name:</div><input name="ADVICE_NAME" type="text" /></label>
<label><div class="text-form">Tel:</div><input name="ADVICE_TEL" type="text" /></label>
                                 
<div class="wrapper">
	<div class="text-form">Message:</div>
	<input style="height:150px; width:300px;  " name="ADVICE_CONTENT" type="text" />
	
</div>
<div class="buttons">
	<!-- <input type="button" value="글등록" onclick="document.getElementById('contact-form').submit()">  -->
	<a class="button" href="#" onClick="document.getElementById('contact-form').reset()">Clear</a>
	<a class="button" href="#" onClick="document.getElementById('contact-form').submit()">Send</a>
	<a class="button" href="./advice_list.html" >목록보기(관리자)</a>
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