<%@page import="com.hcl.ems.EmsBal"%>
<%@page import="com.hcl.ems.Employ"%>
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
	
	out.println("Manager Account Details");
	String user=(String)session.getAttribute("EMP_ID");
	int EMP_ID = Integer.parseInt(user);
		Employ emp = EmsBal.getAccountInfoBal(EMP_ID);
		if(emp.getEmpMgrId() == 0) {
			out.println("Manager Not Available");
		} else {
		emp = EmsBal.getAccountInfoBal(emp.getEmpMgrId());
		out.println("<table border='1'>");
		out.println("<tr><th>Manager ID </th><td>"+emp.getEmpId()+"</td></tr>");
		out.println("<tr><th>Name</th><td>"+emp.getEmpName()+"</td></tr>");
		out.println("<tr><th>Email</th><td>"+emp.getEmpMail()+"</td></tr>");
		out.println("<tr><th>Mobile No. </th><td>"+emp.getEmpMobNo()+"</td></tr>"); 
		out.println("</table>");
		}
	%>
</body>
</html>