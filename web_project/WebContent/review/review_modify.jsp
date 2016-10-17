<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>  
    <title></title>
    <meta charset="utf-8">
    
</head> 
<body id="page5">
	
<h3 >REVIEW(MODIFY)</h3>
         
        
        
    <form id="contact-form" method="post" enctype="multipart/form-data">                    
    <table>
     	<tr>
     		<td>작성자  :</td>
     		<td>작성자 ID<% %></td>
     	<tr>
     
     	<tr>
     		<td>제 목  :</td>
     		<td>
     		<input name="REVIEW_SUBJECT" type="text" />
     		</td>
     	</tr>
     	
     	<tr>
     		<td>파일첨부  :	</td>
     		<td>
     		<input name="REVIEW_FILE" type="file"/>
     		</td>
     	<tr>
     
     
     	<TR	>
     		<td>내 용 :</td>
     		<td>
     		<textarea name="REVIEW_CONTENT" style="width:500px; height:200px ">
     		REVIEW 수정
     		
     		REVIEW_MODIFY.jsp
     		
     		내용내용내용내용~!~~!
     		</textarea>
     		</td>
     	</TR>
     	
     	
     	
		<tr>
			<td><input type="submit" value="수정">
			<input type="reset" value="다시쓰기"></td>
			<td><a href="review_list.jsp">목록보기</td>
		</tr>     					
    </table>
     </form>
	
</body>
</html>
