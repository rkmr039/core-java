<%@page import="com.hcl.dept.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.dept.DeptCrud"%>
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
			<th>Deptno</th>
			<th>Name</th>
			<th>Location</th>
			<th>Head</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
			DeptCrud obj = new DeptCrud();
			List<Department> deptList = obj.showDept();
			for(Department d: deptList) {
		
		%>
		<tr>
			<td><%=d.getDeptno() %></td>
			<td><%=d.getDname() %></td>
			<td><%=d.getLoc()  %></td>
			<td><%=d.getHead() %></td>
			<td>
				<a href="UpdateDept.jsp?deptno=<%=d.getDeptno()%>">Update</a>
			</td>
			<td>
				<a href="DeleteDept.jsp?deptno=<%=d.getDeptno()%>">Delete</a>
			</td>
		<% } %>	
	</table>	
</body>
</html>