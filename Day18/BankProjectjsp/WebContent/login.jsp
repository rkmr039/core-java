
<%@page import="com.hcl.bankjsp.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.hcl.bankjsp.Login" />
	<jsp:setProperty property="*" name="b1"/>
	<%
	boolean status = b1.doLogin();
	if(status){  
	String name = b1.getUserName();
	session.setAttribute("name",name);
	%>
	<jsp:forward page="menu.html"></jsp:forward>
	<%
	
	} else {
		out.println("Invalid Login Credentials...");  	
	}
	%>
</body>
</html>