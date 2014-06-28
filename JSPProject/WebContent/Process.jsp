<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="ca.owenpeterson.dto.User" scope="request">
  <%-- <jsp:setProperty property="username" name="user" /> --%>
  <jsp:setProperty property="*" name="user" />
</jsp:useBean>

Hello <jsp:getProperty property="username" name="user"/>!
Address 1: <jsp:getProperty property="address1" name="user" />
Address 2: <jsp:getProperty property="address2" name="user" />
City: <jsp:getProperty property="city" name="user" />
State: <jsp:getProperty property="state" name="user" />
Pincode: <jsp:getProperty property="pincode" name="user" />

</body>
</html>