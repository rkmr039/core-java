<%@page import="com.hcl.library.LibraryBal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<%
	String name = (String) session.getAttribute("userName");
	String[] checked = request.getParameterValues("returnBox");
	
	for (String id : checked) {
		System.out.println(id);
		System.out.println(name);
		int Id = Integer.parseInt(id);
		out.println(LibraryBal.returnBookBal(name,Id));
	}
	%>
</body>
</html>