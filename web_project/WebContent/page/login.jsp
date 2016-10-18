<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="utf-8">
<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/member_form.css">
</head>
<body>
	<div class="text-center" style="padding: 50px 0">
		<div class="member_logo">login</div>
		<div class="login-form-1">
			<form name="loginform" class="text-left" method="post" action="./MemberLoginAction.html">
				<div class="login-form-main-message"></div>
				<div class="main-login-form">
					<div class="login-group">
						<div class="form-group">
							<input type="text" class="form-control" name="MEMBER_ID" id="MEMBER_ID" placeholder="userID">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" name="MEMBER_PWD" id="MEMBER_PWD" placeholder="password">
						</div>
						<div class="form-group login-group-checkbox">
							<input type="checkbox" id="lg_remember" name="lg_remember">
							<label for="lg_remember">remember ID</label>
						</div>
					</div>
					<button type="submit" class="login-button">
						<i class="fa fa-chevron-right"></i>
					</button>
				</div>
				<div class="etc-login-form">
					<p>
						forgot your password? <a href="#">click here</a>
					</p>
					<p>
						new user? <a href="#">create new account</a>
					</p>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
