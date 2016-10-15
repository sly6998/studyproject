<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
</head>
<body>
	<h3>로그인페이지</h3>
	<form name="loginform" action="./MemberLoginAction.html" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="MEMBER_ID"/></td>
			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="MEMBER_PWD" /></td>
			</tr>

			<tr>
				<td colspan="2" align=center>
					<input type="submit" value="로그인">&nbsp;&nbsp;
					<a href="./join.html"> 회원가입 </a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
