<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/loader.css"/>
<META http-equiv="refresh" content="10;URL=http://yournewurl">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script>
function myFunction() {
  setTimeout(3000);
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Leave Management System</h1>
	<div class="loader"></div>
	<form method="get" name="myForm">
		<input type="submit" value="Login Page" onclick="muFunction" />
	</form>
	<jsp:forward page="login.html"></jsp:forward>
</body>
</html>