<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  String MEMBER_ID = null;
  String MEMBER_NAME = null;
  String MEMBER_TEL = null;
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
                                                	<h3 class="p2">상담리스트 (관리자)</h3>
                                                    
<form id="contact-form" method="post" enctype="multipart/form-data">                    
<fieldset>
<table width="870">
      <!-- 빈공간(여백) -->
      <tr>
         <td style="border: 0px solid #000;" colspan="5" height="20px"></td>
      </tr>
      
      <!-- 항목 -->
      <tr align="center" style="border: 1px solid #ddd; background-color: #EFEFEF">
         <td
            style="font-size: 12pt; border: 1px solid #ddd; font-weight: bold; width: 80px;"
            height="26">
            <div align="center">상담방법</div>
         </td>

         <td style="font-size: 12pt; font-weight: bold; border: 1px solid #ddd;"
            width="400" height="26">
            <div align="center">-</div>
         </td>

         <td
            style="font-size: 12pt; font-weight: bold; border: 1px solid #ddd;"
            width="190" height="26">
            <div align="center">신청자(ID)</div>
         </td>

         <td
            style="font-size: 12pt; font-weight: bold; border: 1px solid #ddd;"
            width="100" height="26">
            <div align="center">날짜</div>
         </td>
      </tr>
    
      <!-- 내용 -->
      <tr align="center" valign="middle" style="border:0px solid #ddd;"
         onmouseover="this.style.backgroundColor='#F8F8F8'">
         <td height="23"
            style="font-family: Tahoma; font-size: 10pt; border: 0px solid #000;">
          1
         </td>

         <td
            style="font-family: Tahoma; font-size: 10pt; border: 0px solid #000;">
            
         2
         </td>

         <td
            style="font-family: Tahoma; font-size: 10pt; border: 0px solid #000;">
            <div align="center">
            3
            </div>
         </td>

         <td
            style="font-family: Tahoma; font-size: 10pt; border:0px solid #000;">
           4
         </td>
      </tr>
</table>                                                        


                      
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