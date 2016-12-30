<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.dinesh.java.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css">
		body{
		color:black;text-decoration: underline;text-shadow:3px 2px red;text-transform:uppercase;text-align:center;
		background:url("MVCjsp.png");
		}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
<h3>LOGIN SUCCESSFULL</h3>
<%
User user = (User)session.getAttribute("user"); 
%>
Hello : <%= user.getUserName() %>
 
</body>
</html>