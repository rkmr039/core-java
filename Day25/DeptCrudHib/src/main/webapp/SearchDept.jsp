<%@page import="com.hcl.dept.Department"%>
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
	<form method="post" action="SearchDept.jsp">
		<center>
			DEPTNO : <input type="text" name="deptno" /><br/><br/>
			<input type="submit" value="Search" />
		</center>
	</form>
	
	<%
	 	if(request.getParameter("deptno") != null) {
	 		int deptno = Integer.parseInt(request.getParameter("deptno"));
	 		DeptCrud crud = new DeptCrud();
	 		Department d = crud.searchDept(deptno);
	 		out.println("================================<br/><br/>");
	 		out.println(d.getDeptno());
	 		out.println(d.getDname());
	 		out.println(d.getLoc());
	 		out.println(d.getHead());
	 	}
	%>
</body>
</html>