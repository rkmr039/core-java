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
	url="jdbc:mysql://localhost:3306/bank"
	user="root"
	password="root"/>
	
	<sql:query var="searchAccountQuery" dataSource="${conn}">
		select * from Accounts where AccountNo = ?
		<sql:param value="${param.accno}"/> 
	</sql:query>
	<form method="get" action="UpdateAccount2.jsp">
		<center>
		<c:forEach var="e" items="${searchAccountQuery.rows}">
				Account No:
				<input type="text" value="${param.accno}" name="accno" readonly /><br/><br/>
				First Name:
				<input type="text" value="${e.firstName}" name="firstName"/><br/><br/>
				Last Name:
				<input type="text" value="${e.lastName}" name="lastName"/><br/><br/>
				City:
				<input type="text" value="${e.city }" name="city"/><br/><br/>
				State:
				<input type="text" value="${e.state }" name="state"/><br/><br/>
				Amount :
				<input type="text" value="${e.amount}" name="amount"/><br/><br/>
				CheqFacil: Yes or No
				<input type="text" value="${e.cheqFacil }" name="cheqFacil"/><br/><br/><br/><br/>
				Account Type: Saving or Current
				<input type="text" value="${e.accountType }" name="accountType"/><br/><br/><br/><br/>
				<input type="submit" value="Update Account" />
				</c:forEach>
		</center>
	</form>
</body>
</html>