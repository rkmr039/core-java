<%@page import="com.hcl.library.LibraryBal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Account | Library</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<%
		String userName = (String)session.getAttribute("userName");
		String[][] result = LibraryBal.showIssuedBooksBal(userName);
		for (String[] res : result) {
			  out.println("<br/><br/>"
			  		+ " Book Id : " + res[0] + " Issued On " + res[1] + " <br/>===========================================<br/>");
			}
	%>
	
	
</body>
</html>