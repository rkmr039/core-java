<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<c:if test="${not empty emps}">
		<c:forEach var="listValues" items="${emps }">
			<table border="3">
				<tr>
					<td>${listValues}</td>
				</tr>
			</table>
		</c:forEach>
	</c:if> 
	<c:if test="${not empty emp}">
		<c:forEach var="listValues" items="${emp }">
			<table border="3">
				<tr>
					<td>${listValues}</td>
				</tr>
			</table>
		</c:forEach>
	</c:if>  --%>
	
	<c:out value="${message}"/>
</body>
</html>