<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<div id="wrapper">
		<form action="login" method="post" id="loginForm">
		<div class="field">
			<label for="userId">User ID: </label>
			<input type="text" name="userId" />
		</div>
		<div class="field">
			<label for="password">Password:</label>
			<input type="password" name="password" />
		</div>
		<div class="login">
			<input type="submit" value="Login"/>
		</div>
		</form>
	</div>
</body>
</html>