<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.interior.noti.*" %>
<%
 NotiBean noti=(NotiBean)request.getAttribute("notidata");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
  <table cellpadding="0" cellspacing="0">
   <tr align="center" valign="middle">
    <td colspan="5">MVC 게시판</td>
   </tr>
   
   <tr>
    <td style="font-family:돋움; font-size:12" height="16">
     <div align="center">제목&nbsp;&nbsp;</div>
    </td>
 
    <td style="font-family:돋움; font-size:12">
     <%=noti.getNOTI_SUBJECT() %>
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
       <td valign=top style="font-family:돋움; font-size:12">
        <%= noti.getNOTI_CONTENT() %>
       </td>
      </tr>
     </table>
    </td>
   </tr>
   
   <tr bgcolor="cccccc">
    <td colspan="2" style="height:1px;"></td>
   </tr>
   
   <tr><td colspan="2">&nbsp;</td></tr>
   
   <tr align="center" valign="middle">
    <td colspan="5">
     <font size=2>
      <a href="./noti_modify_view.html?NOTI_NUM=<%=noti.getNOTI_NUM() %>">[수정]</a>&nbsp;&nbsp;
      <a href="./NotiDeleteAction.html?NOTI_NUM=<%=noti.getNOTI_NUM() %>">[삭제]</a>&nbsp;&nbsp;
      <a href="./noti_list.html">[목록]</a>&nbsp;&nbsp;
     </font>
    </td>
   </tr>
  </table>
  <!-- 게시판 수정 -->
  
  
  
  
  <!-- 댓글 -->
  <table>
  	<%
	  for(int i=0; i<noti_reply.size(); i++){
		BoardBean bl = (BoardBean)noti_reply.get(i);
	%>
	
	  <tr>
  		<td>
		  <%if(bl.getNOTI_REPLY_LEV() != 0){ %>
			<% for(int a=0; a<=bl.getNOTI_REPLY_LEV()*2; a++){ %>
			  &nbsp;
			<%}%>
			▶
		  <%}else{%>
			▶
		  <%}%>
		  <a href="#"><%= bl.getNOTI_REPLY_MEMBER_NAME() %></a>
		</td>
		<td align="right">
		  <%= bl.getNOTI_REPLY_DATE() %>
		</td>
	  </tr>
	  
	  <tr>
	    <td>
		  <% for(int a=0; a<=bl.getNOTI_REPLY_LEV()*2; a++){ %>
			&nbsp;
		  <%}%>
		  <%= bl.getNOTI_REPLY_CONTENT() %>
		</td>
	  </tr>
		  <%}%>
      <tr>
        <td>
		  <textarea rows="80" cols="30"></textarea>
        </td>
        <td>
          <input type="submit" value="확인">
        </td>
      </tr>
  </table>
  
  
</body>
</html>