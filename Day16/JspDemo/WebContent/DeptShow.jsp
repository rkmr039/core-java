<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
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
		Connection con = DaoConnection.getConnection();
		String cmd = "SELECT * FROM department";
		PreparedStatement pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
	%>
		<br/>
		DeptNo       : <%=rs.getInt("deptno") %><br/>
		Name         : <%=rs.getString("dname") %><br/>
		Location     : <%=rs.getString("loc") %><br/>
		===========================================
	<%
		}
	%>
</body>
</html>