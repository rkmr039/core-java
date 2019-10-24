
<%@page import="com.hcl.emp.Employ"%>
<%@page import="java.util.List"%>
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

	<form method="post" action="SearchEmploy.jsp">
		EMPNO : <input type="text" name="empno" /><br/><br/>
		<input type="submit" value="Search"/>
	</form>

	<%
	if(request.getParameter("empno") != null) {
	int empno = Integer.parseInt(request.getParameter("empno"));
	
	%>
	<br/><br/>
	<table border="3">
		<tr>
			<th>Empno</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Desig</th>
			<th>Salary</th>
		</tr>
		<%
			EmployCrud obj = new EmployCrud();
			Employ  e = obj.searchEmploy(empno);
		%>
		<tr>
			<td><%=e.getEmpno() %></td>
			<td><%=e.getName() %></td>
			<td><%=e.getDept()  %></td>
			<td><%=e.getDesig() %></td>
			<td><%=e.getBasic()  %></td>
		</tr>
	</table>
	<% } %>
</body>
</html>