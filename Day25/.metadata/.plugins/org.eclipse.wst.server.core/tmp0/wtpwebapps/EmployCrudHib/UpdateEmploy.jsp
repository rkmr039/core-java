<%@page import="com.hcl.emp.Employ"%>
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
	<%
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployCrud crud = new EmployCrud();
		Employ e = crud.searchEmploy(empno);
	%>
	
	<form method="post" action="UpdateEmploy.jsp">
		<center>
			Empno : <input type="text" readonly="readonly" name="empno" value=<%=e.getEmpno()%> /><br/><br/>
			Employ Name: <input type="text" name="name" value=<%=e.getName()%> /><br/><br/>
			Department : <input type="text" name="dept" value=<%=e.getDept()%> /><br/><br/>
			Designation : <input type="text" name="desig" value=<%=e.getDesig()%> /><br/><br/>
			Basic Salary : <input type="text" name="basic" value=<%=e.getBasic()%> /><br/><br/>
			<input type="submit" value="Update" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="Reset" />
		</center>
	</form>
	
	<%
	if( request.getParameter("empno") != null &&
		request.getParameter("name")  != null &&
		request.getParameter("dept")  != null &&
		request.getParameter("desig") != null &&
		request.getParameter("basic") != null
		) {
	e = new Employ();
	empno = Integer.parseInt(request.getParameter("empno"));
	String name = request.getParameter("name");
	String dept = request.getParameter("dept");
	String desig = request.getParameter("desig");
	int basic = Integer.parseInt(request.getParameter("basic"));
	e.setEmpno(empno);
	e.setName(name);
	e.setDept(dept);
	e.setDesig(desig);
	e.setBasic(basic);
	crud = new EmployCrud();
	out.println(crud.updateEmploy(e));
	%>
		<jsp:forward page="ShowEmploy.jsp"></jsp:forward>
	<%
	}%>
	
</body>
</html>