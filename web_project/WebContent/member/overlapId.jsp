<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int result = (int) request.getAttribute("overlap");
%>
<!DOCTYPE html">
<html>
<head>
<script src="<%=request.getContextPath()%>/js/join.js"></script>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<title></title>
</head>
<body>
	<div align="center" valign="middle">
		<p/><br/>
		<%
			if (result == 1) {
		%>
		<span> 이미 가입되어 있는 아이디 입니다.</span>
		<%
			} else {
		%>
		<span> 가입 가능한 아이디 입니다.</span>
		<%
			}
		%><p/>
	<button class="btn" onclick="overlapClose(<%=result%>)">Close</a>
	</div>
</body>
</html>