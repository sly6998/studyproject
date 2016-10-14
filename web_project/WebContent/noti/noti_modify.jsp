<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>  
    <title></title>
    <meta charset="utf-8">
    
</head> 
<body id="page5">
	
<h3 >공지사항(MODIFY)</h3>
         
        
        
    <form id="contact-form" method="post" enctype="multipart/form-data">                    
    <table>
     	<tr>
     		<td>작성자  :</td>
     		<td>작성자 ID<% %></td>
     	<tr>
     
     	<tr>
     		<td>제 목  :</td>
     		<td>
     		<input name="NOTI_SUBJECT" type="text" />
     		</td>
     	</tr>
     	
     	<tr>
     		<td>파일첨부  :	</td>
     		<td>
     		<input name="NOTI_FILE" type="file"/>
     		</td>
     	<tr>
     
     
     	<TR	>
     		<td>내 용 :</td>
     		<td>
     		<textarea name="NOTI_CONTENT" style="width:500px; height:200px ">
     		공지사항 수정
     		
     		noti_modify.jsp
     		
     		내용내용내용내용~!~~!
     		</textarea>
     		</td>
     	</TR>
     	
     	
     	
		<tr>
			<td><input type="submit" value="수정">
			<input type="reset" value="다시쓰기"></td>
			<td><a href="">목록보기</td>
		</tr>     					
    </table>
     </form>
	
</body>
</html>
