<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="conn"
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/sqlpractice"
	user="root"
	password="root"/>
	
	<%-- <form method="get" action="EmployUpdate.jsp">
		<center>
			Employ No:
			<input type="text"  value="<%=rs.getInt("empno") %>" readonly  name="empno"/><br/><br/>
			Employ Name:
			<input type="text"  value="<%=rs.getString("name")%>" name="name"/><br/><br/>
			Department:
			<input type="text"  value="<%=rs.getString("dept")%>" name="dept"/><br/><br/>
			Designation:
			<input type="text"  value="<%=rs.getString("desig")%>" name="desig"/><br/><br/>
			Salary:
			<input type="text"  value="<%=rs.getInt("basic")%>" name="basic"/><br/><br/>
			<input type="submit" value="Update"/><br/><br/>
		</center>
	</form> --%>
</body>
</html>