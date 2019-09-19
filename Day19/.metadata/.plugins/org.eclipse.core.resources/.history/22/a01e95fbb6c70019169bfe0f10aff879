<%@page import="java.util.List"%>
<%@page import="com.hcl.library.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Available Books</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<jsp:useBean id="b1" class="com.hcl.library.SearchBooks"></jsp:useBean>
	<jsp:setProperty property="*" name="b1"/>
	
	<%
		List<Book> books = b1.searchBook();
		out.println("<br/><br/>");
		out.println("<form method='post' action='IssueBooks.jsp'>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>ID</th>");
		out.println("<th>Name</th>");
		out.println("<th>Author</th>");
		out.println("<th>Edition</th>");
		out.println("<th>Dept</th>");
		out.println("<th>TotalBooks</th>");
		out.println("<th>Issue</th>");
		out.println("</tr>");
		for (Book book : books) {
			out.println("<tr>");
			out.println("<td>" + book.getId() + "</td>");
			out.println("<td>" + book.getName() + "</td>");
			out.println("<td>" + book.getAuthor() + "</td>");
			out.println("<td>" + book.getEdition() + "</td>");
			out.println("<td>" + book.getDept() + "</td>");
			out.println("<td>" + book.getNos() + "</td>");
			if(book.getNos() == 0) {
				out.println("<td><input type='checkbox' disabled  name='issueBox' id='issue'></td>");	
			} else {
				out.println("<td><input type='checkbox' name='issueBox' value='"+ book.getId() + "' /></td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<input type='submit' value='Issue' id='issueButton' />");
		out.println("</form>");
		out.println("<br/><br/><span><b><h1>Please Select Atleast One Book To Issue</h1></b></span>"); 
	%>
</body>
</html>