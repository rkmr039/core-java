<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.deptcrud.DaoConnection"%>
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
	<%
		if(request.getParameter("deptno") != null) {
			Connection con = DaoConnection.getConnection();
			int empno = Integer.parseInt(request.getParameter("deptno"));
			String cmd = "DELETE FROM department WHERE deptno = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1,empno);
			pst.executeUpdate();
		}
	%>
	<jsp:forward page="DeptShow.jsp"></jsp:forward>
</body>
</html>