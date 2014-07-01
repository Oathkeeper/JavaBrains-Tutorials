<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration Page</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<div id="wrapper">
		<form action="Process.jsp" method="post" id="loginForm">
		<div class="field">
			<div class="field">
				<label for="userId">User ID: </label>
				<input type="text" name="userId" />
			</div>
			<div>
				<label for="username">User Name:</label>
				<input type="text" name="username" />
			</div>
			<div>
	      <label for="address1">Address Line 1:</label>
	      <input type="text" name="address1" />
	    </div>
	    <div>
	      <label for="address2">Address Line 2:</label>
	      <input type="text" name="address2" />
	    </div>
	    <div>
	      <label for="city">City:</label>
	      <input type="text" name="city" />
	    </div>
	    <div>
	      <label for="state">State:</label>
	      <input type="text" name="state" />
	    </div>
	    <div>
	      <label for="pincode">Pincode:</label>
	      <input type="text" name="pincode" />
	    </div>
    </div>
		<div class="login">
			<input type="submit" value="Login"/>
		</div>
		</form>
	</div>
</body>
</html>