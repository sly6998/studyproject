<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>메인 페이지</title>
<meta charset="utf-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/reset.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/grid.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="<%=request.getContextPath()%>/js/jquery-1.6.2.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/jquery.galleriffic.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/jquery.opacityrollover.js" type="text/javascript"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="<%=request.getContextPath()%>/js/join.js"></script>
</head>
<body id="page1">
	<%@ include file="./header.jsp"%>
	<%@ include file="./contents.jsp"%>
	<%@ include file="./footer.jsp"%>
</body>
</html>
