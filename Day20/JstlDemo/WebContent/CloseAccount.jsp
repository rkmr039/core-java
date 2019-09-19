<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
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
	<sql:update var="closeQuery" dataSource="${conn}">
		update accounts set status = 'Inactive' where AccountNo = ?
		<sql:param value="${param.accno}"/>
	</sql:update>
	<jstl:out value="Account Closed Successfully..."/>
	<%-- <jstl:set var="flag" value="0"/>
	<jstl:forEach var="e" items="${closeQuery.rows}">
		
	</jstl:forEach> --%>
	
</body>
</html>