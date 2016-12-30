<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Objects</title>
</head>
<body>
<%
String userName = request.getParameter("uID");
String passwd = request.getParameter("pwd");

if (userName!=null && passwd!=null){
	session.setAttribute("SessionUserName", userName);
	session.setAttribute("SessionPsswd", passwd);
	application.setAttribute("ApplicationUserName", userName);
	application.setAttribute("ApplicationPsswd", passwd);
	//pageContext.setAttribute("pageContextUserName",userName);
	//pageContext.setAttribute("pageApplicationUserName", userName, PageContext.SESSION_SCOPE);
	//pageContext.setAttribute("pageApplicationContextPwd", passwd, PageContext.SESSION_SCOPE);
	
}
%>


RequestObject UserName:<%=userName %>
<br>
RequestObject Pwd:<%=passwd %>
<br>
SessionObject UserName:<%=session.getAttribute("SessionUserName") %>
<br>
SessionObject Pwd:<%=session.getAttribute("SessionPsswd") %>
<br>
ApplicationObject UserName:<%=application.getAttribute("ApplicationUserName") %>
<br>
ApplicationObject Pwd:<%=application.getAttribute("ApplicationPsswd") %>
<br>
Find Attribute: <%=pageContext.getPage() %>

<!-- 
PageApplicationContextObject UserName:<%=(String)pageContext.getAttribute("pageApplicationContextUserName") %> 
<br>
PageApplicationContextObject Password:<%=(String)pageContext.getAttribute("pageApplicationContextPwd") %> 
<br>
PageContextFindAttribute ScopeUserName: <%=(String)pageContext.findAttribute("uId")%>
<br>
PageContextFindAttribute ScopePawssord: <%=(String)pageContext.findAttribute("pwd")%>
--> 

</body>
</html>