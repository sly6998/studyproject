<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    
<%@ page import="java.util.*" %>
    
<%@ page import="java.text.SimpleDateFormat" %>
    
<%@ page import="com.interior.noti.*" %>
 
<%-- <%
	String id = null;
	if(session.getAttribute("id")!=null){
		id = (String)session.getAttribute("id");
	}
	List boardList = (List)request.getAttribute("boardlist");
	int listcount = ((Integer)request.getAttribute("listcount")).intValue();
	int nowpage = ((Integer)request.getAttribute("page")).intValue();
	int maxpage = ((Integer)request.getAttribute("maxpage")).intValue();
	int startpage = ((Integer)request.getAttribute("startpage")).intValue();
	int endpage = ((Integer)request.getAttribute("endpage")).intValue();
 	


%> --%>
 

 

    


<!DOCTYPE html>
<html lang="en">
<head>  
    <title></title>
    <meta charset="utf-8">
      
   
</head> 
<body>
<h3>공지사항 </h3>
         
        
        
    <table width="870">
	
	<!-- 빈공간(여백) -->
	<tr>
	<td style="border:0px solid #000;" colspan="5" height="20px"> </td>
	</tr>
	
	<!-- 항목 (번호/제목 / 글쓴이 / 날짜 / 조회수 ) -->
	<tr align="center" style="border:1px solid #ddd; background-color:#EFEFEF ">
		<td style="font-size:12pt;  border:1px solid #ddd; font-weight:bold; width:80px; "  height="26">
			<div align="center"> 번호 </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="400"  height="26">
			<div align="center"> 제목 </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="190"  height="26">
			<div align="center"> 글쓴이 </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="100" height="26">
			<div align="center"> 날짜 </div>
		</td>
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="100" height="26">
			<div align="center"> 조회수 </div>
		</td>
	</tr>
	

	
	<!-- 내용 (번호/아이디/이름/수정/탈퇴) -->
	<tr align="center" valign="middle"  style="border:1px solid #ddd;"
		onmouseover="this.style.backgroundColor='#F8F8F8'">
		<td height="23" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<a href="" style='text-decoration: none;'>
			 </a>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center">  </div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center">  </div>
		</td>
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center"> </div>
		</td>
		</td>
	</tr>
	
	
	
	<!-- [이전] / [1] [2] [3] / [다음] -->
	<tr align="center" height="20">
		<td colspan="3" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			
			
				
				
				
				[1]
				
			
		</td>
		
		<td colspan="2" align="right">
		<a href=""> 글쓰기(관리자용)</a>
		</td>
	</tr>
	
	
	</table>
                                                	
                                                    
                                                
                                               
</body>
</html>
