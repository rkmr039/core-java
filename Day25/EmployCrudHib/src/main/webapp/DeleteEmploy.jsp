<%@page import="com.hcl.emp.Employ"%>
<%@page import="com.hcl.emp.EmployCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		EmployCrud crud = new EmployCrud();
		if(request.getParameter("empno") != null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			crud.removeEmploy(empno);
			response.sendRedirect("ShowEmploy.jsp");
		}
	%>
</body>
</html>