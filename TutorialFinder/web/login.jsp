<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log In to Continue</title>
</head>
<body>
  <s:form action="login" method="post">
    <s:textfield label="Login ID" key="userId" />
    <s:password label="Password" key="password" />
    <s:submit value="Log In" />  
  </s:form> 

</body>
</html>