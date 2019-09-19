<%@page import="com.hcl.ems.EmsBal"%>
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
		String btn = request.getParameter("approv");
		String comments = request.getParameter("comments");
		String leaveid = request.getParameter("leaveId");
		int leaveId = Integer.parseInt(leaveid);
		if(btn.equals("Approve")) {
			EmsBal.approveDenyLeaveBal(leaveId, comments,"Approve");	
		} else {
			EmsBal.approveDenyLeaveBal(leaveId, comments,"DENIED");
		}
	%>
	<jsp:forward page="dashboard.jsp"></jsp:forward>
</body>
</html>