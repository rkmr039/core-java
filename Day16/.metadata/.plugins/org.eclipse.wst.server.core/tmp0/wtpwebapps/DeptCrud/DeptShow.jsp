<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.deptcrud.DaoConnection"%>
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
			<th>deptno</th>
			<th>Name</th>
			<th>Location</th>
			<th>Head</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
			Connection con = DaoConnection.getConnection();
			String cmd = "SELECT * FROM department";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("deptno") %></td>
			<td><%=rs.getString("dname") %></td>
			<td><%=rs.getString("loc") %></td>
			<td><%=rs.getString("head") %></td>
			<td><a href="UpdateDept.jsp?deptno=<%=rs.getInt("deptno")%>" >Update</a></td>
			<td><a href="RemoveDept.jsp?deptno=<%=rs.getInt("deptno")%>" >Delete</a></td>
		</tr>
		<% } %>
		
	</table>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="AddDept.jsp" >Add Department</a>
</body>
</html>