<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.interior.qna.*" %>
<%
 QnaBean qna=(QnaBean)request.getAttribute("qnadata");
 QnaBean qna2=(QnaBean)request.getAttribute("qnadata2");
 
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">							

	<h3 class="p2">QnA(detail)</h3>
	<table cellpadding="0" cellspacing="0">
   <tr align="center" valign="middle">
    <td colspan="5">QNA 게시판</td>
   </tr>
   
   <tr>
    <td style="font-family:돋움; font-size:12" height="16">
     <div align="center">제목&nbsp;&nbsp;</div>
    </td>
 
    <td style="font-family:돋움; font-size:12">
     <%=qna.getQnA_SUBJECT() %>
    </td>
   </tr>
   
   <tr bgcolor="cccccc">
    <td style="height:1px;" colspan="2">
    </td>
   </tr>
   
   <tr>
    <td style="font-family:돋움; font-size:12">
     <div align="center" valign="middle">내용</div>
    </td>
    <td style="font-family:돋움; font-size:12">
    
    
     <table border=0 width=490 height=250 style="table-layout:fixed">
      <tr>
       <td valign=top style="font-family:돋움; font-size:12" >
        <%= qna.getQnA_CONTENT() %>
       </td>
      </tr>
     </table>
     
     
    </td>
   </tr>
   
   <tr bgcolor="cccccc">
    <td colspan="3" style="height:1px;"></td>
   </tr>
   
  
   
   <tr>
    <Td colspan=3>
    	
    	<table width=500>
    		<tr> 
				<td style="border:0px solid #ddd; font-size:small; font-weight:bold; ">
					<%= qna2.getQnA_REPLY_MEMBER_ID() %>
				</td>
				
			   	<td style="border:0px solid #ddd; font-size:small;" align="center" width="350">
			   		<%= qna2.getQnA_REPLY_CONTENT() %>
			   	</td>
			   	
		   		<td style="border:0px solid #ddd; font-size:small;" align="right">
		   			<font color="#747474"><%= qna2.getQnA_REPLY_DATE() %></font>
		   		</td>
    		</tr>
    	</table> 
		   
	<tr bgcolor="cccccc">
    <td colspan="3" style="height:1px;"></td>
   </tr>
     </Td>
    </tr>

   <tr align="center" valign="middle">
    <td colspan="5">
     <font size=2>
      <a href="./qna_modify_view.html?QNA_NUM=<%=qna.getQnA_NUM() %>">[수정]</a>&nbsp;&nbsp;
      <a href="./QnaDeleteAction.html?QNA_NUM=<%=qna.getQnA_NUM() %>">[삭제]</a>&nbsp;&nbsp;
      <a href="./qna_list.html">[목록]</a>&nbsp;&nbsp;
     </font>
    </td>
   </tr>
  </table>
    
</body>
</html>
