<%@page import="com.hcl.emp.EmployCrud"%>
<%@page import="com.hcl.emp.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form method="post" action="InsertEmploy.jsp">
		<center>
			Employ Name: <input type="text" name="name" /><br/><br/>
			Department : <input type="text" name="dept" /><br/><br/>
			Designation : <input type="text" name="desig" /><br/><br/>
			Basic Salary : <input type="text" name="basic" /><br/><br/>
			<input type="submit" value="Insert" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="Reset" />
		</center>
	</form>
	
	<%
		if(request.getParameter("name") != null &&
			request.getParameter("dept") != null &&
			request.getParameter("desig") != null &&
			request.getParameter("basic") != null
			) {
		
		Employ e = new Employ();
	
		String name = request.getParameter("name");
		String dept = request.getParameter("dept");
		String desig = request.getParameter("desig");
		int basic = Integer.parseInt(request.getParameter("basic"));
		e.setName(name);
		e.setDept(dept);
		e.setDesig(desig);
		e.setBasic(basic);
		EmployCrud crud = new EmployCrud();
		boolean flag = crud.insertEmploy(e);
		if(flag) { 
			%> <p>EMPLOY CREATED SUCCESSFULLY</p>
		<% } else { 
				%> <p>NOT CREATED </p>
		 <% }}%>
</body>
</html>