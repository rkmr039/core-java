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
		String[] checked = request.getParameterValues("issueBox");
		try{
			if(checked.length == 0) {}
		} catch(NullPointerException e) {
	%>
	<jsp:forward page="IssueBooks.html"></jsp:forward>
	<%		
	}
		String name = (String)session.getAttribute("userName"); 
		for (String id : checked) {
			int Id = Integer.parseInt(id);
			boolean i = LibraryBal.issueBookBal(name,Id);
			if(i) {
				out.println("<br/><h5>Book ID(" + Id + ") issued.</h5><br/>");
			} else {
				out.println("<br/><h5>Book ID(" + Id + ") already issued.</h5><br/>");
			}
			out.println("<b><h5>More then 3 books are not allowed at a time.</h5></b>");
		} 
	%>
</body>
</html>