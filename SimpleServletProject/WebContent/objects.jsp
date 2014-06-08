<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String username = request.getParameter("name");
if (username != null) {
	session.setAttribute("sessionUsername", username);
	//application.setAttribute("applicationUsername", username);
	pageContext.setAttribute("pageContextUserName", username);
	pageContext.setAttribute("applicationUsername", username, PageContext.APPLICATION_SCOPE);
	pageContext.findAttribute("name");
}

%>
<p>The user name in the request object is: <%= username %></p>
<p>The user name in the session object is: <%= session.getAttribute("sessionUsername") %></p>
<p>The user name in the application object is: <%= application.getAttribute("applicationUsername") %>
<p>The user name in the context object is: <%= pageContext.getAttribute("pageContextUserName") %>

</body>
</html>