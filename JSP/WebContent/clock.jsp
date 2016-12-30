<!-- Below @page is a page directory -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clock here</title>
</head>
<body>
<!-- Below is a include directory
When ever there is a include directory noticed then 
it substitutes the o/p of the hello.jsp and then continues with rest of the o/p
Hello.jsp has only text: it is acceptable to have only text in jsp where implicitly it converts it into Printer wrtier 
-->
<%@ include file = "/hello.jsp" %>
<br>
The time is:<%=new Date() %>
<br>




</body>
</html>