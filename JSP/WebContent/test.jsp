<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Test JSPS</h1>
<!-- Declaration tags -->
<%!
int k1;
public int add(int a, int b){
	return a+b;
}
%>

<%
k1=add(35643,5435);
%>
Value k1:<%=k1 %>

<br>

<%
int i=1;
int j =2;
int k;
k=i+j;
%>
Value k:<%=k %>


</body>
</html>