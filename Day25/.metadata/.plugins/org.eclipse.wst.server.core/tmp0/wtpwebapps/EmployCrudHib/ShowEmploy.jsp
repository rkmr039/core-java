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
	<table border="3">
		<tr>
			<th>Empno</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Desig</th>
			<th>Salary</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
			EmployCrud obj = new EmployCrud();
			List<Employ> empList = obj.showEmploy();
			for(Employ e: empList) {
		
		%>
		<tr>
			<td><%=e.getEmpno() %></td>
			<td><%=e.getName() %></td>
			<td><%=e.getDept()  %></td>
			<td><%=e.getDesig() %></td>
			<td><%=e.getBasic()  %></td>
			<td>
				<a href="UpdateEmploy.jsp?empno=<%=e.getEmpno()%>">Update</a>
			</td>
			<td>
				<a href="DeleteEmploy.jsp?empno=<%=e.getEmpno()%>">Delete</a>
			</td>
		<% } %>	
	</table>	
	
</body>
</html>