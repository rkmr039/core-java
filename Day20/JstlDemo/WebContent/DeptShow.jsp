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
	
	<sql:query var="showDeptQuery" dataSource="${conn}">
		select * from department
	</sql:query> 
	<c:forEach var="e" items="${showDeptQuery.rows}">
		<br/>Department No:
		<c:out value="${e.deptno }" /><br/>
		Location:
		<c:out value="${e.loc }" /><br/>
		Head:
		<c:out value="${e.head }" /><br/>
		<c:out value="======================"/>
	</c:forEach>
</body>
</html>