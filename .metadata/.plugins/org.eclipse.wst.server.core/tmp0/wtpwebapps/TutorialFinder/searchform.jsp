<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="styles.css" />
<title>Search</title>
</head>
<body>
<!-- <form method="post" action="tutorials/getTutorial.action">
  <div class="fields">
    <div>
      <label for="language">Search: </label>
      <input id="language" name="language" />
    </div>
    <div>
      <input type="submit" value="Search!" />
    </div>  
  </div>
</form> -->
 <s:form action="/tutorials/getTutorial">
    <s:textfield key="language" label="enter the language you want to search for"></s:textfield>
    <s:submit value="Search!" />  
  
  </s:form>

</body>
</html>