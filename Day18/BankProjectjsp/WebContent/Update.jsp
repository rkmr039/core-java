<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.html"></jsp:include>
	<br/><br/>
	<form method="get" action="UpdateAccount.jsp">
		<center>
			Account No:
			<input type="text" name="accno" /><br/><br/>
			City:
			<input type="text" name="city" /><br/><br/>
			State:
			<input type="text" name="state" /><br/><br/>
			<input type="submit" value="Update Accounts"/>
		</center>
	</form>
</body>
</html>