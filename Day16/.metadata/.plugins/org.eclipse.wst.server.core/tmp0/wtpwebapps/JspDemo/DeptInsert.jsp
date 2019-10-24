<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form method="get" action="DeptInsert.jsp">
		<center>
			Department No:
			<input type="text" name="deptno"/><br/><br/>
			Department Name:
			<input type="text" name="dname"/><br/><br/>
			Department Location:
			<input type="text" name="loc"/><br/><br/>
			Department Head:
			<input type="text" name="head"/><br/><br/>
			<input type="submit" value="Insert"/><br/><br/>
		</center>
	</form>
	<%
	if(request.getParameter("deptno") != null) {
		Connection con = DaoConnection.getConnection();
		String cmd = "INSERT INTO department VALUES(?,?,?,?)";
		
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		String head = request.getParameter("head");
		
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1,deptno);
		pst.setString(2, dname);
		pst.setString(3, loc);
		pst.setString(4, head);
		pst.executeUpdate();
		out.println("Inserted");
	}
	%>
</body>
</html>