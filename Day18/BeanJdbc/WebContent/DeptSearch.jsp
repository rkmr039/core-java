<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b2" class="com.hcl.deptbeans.DeptSearch" />
	<jsp:setProperty property="*" name="b2"/>
	<%
	ResultSet rs = b2.searchDept();
	if(rs.next()) {
		out.println("==============================================<br/>");
		out.println("Name : " + rs.getString("dname") +"<br/>" );
		out.println("Location : " + rs.getString("loc") +"<br/>" );
		out.println("Head : " + rs.getString("head") +"<br/>" );
		
	} else {
		out.println("*** Record not found***");
	}
	%>
	
</body>
</html>