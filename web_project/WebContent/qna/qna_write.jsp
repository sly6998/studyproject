<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>  
    <title></title>
    <meta charset="utf-8">
    
</head> 
<body id="page5">
	
<h3 >QNA(write)</h3>
         
        
        
    <form id="contact-form" method="post" enctype="multipart/form-data">                    
    <table>
     	<tr>
     		<td>작성자  :</td>
     		<td>작성자 ID<% %></td>
     	<tr>
     
     	<tr>
     		<td>제 목  :</td>
     		<td>
     		<input name="QnA_SUBJECT" type="text" />
     		</td>
     	</tr>
     	
     	<tr>
     		<td>파일첨부  :	</td>
     		<td>
     		<input name="QnA_FILE" type="file"/>
     		</td>
     	<tr>
     
     
     	<TR	>
     		<td>내 용 :</td>
     		<td>
     		<textarea name="QnA_CONTENT" style="width:500px; height:200px ">
     		QNA 작성
     		
     		noti_write.jsp
     		
     		내용내용내용내용~!~~!
     		</textarea>
     		</td>
     	</TR>
     	
     	
     	
		<tr>
			<td><input type="submit" value="작성">
			<input type="reset" value="다시쓰기"></td>
			<td><a href="qna_list.jsp">목록보기</td>
		</tr>     					
    </table>
     </form>
	
</body>
</html>
