<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="data.jsp">
		<center>
			Age :
			<input type="text" name="age" /><br/><br/>
			<input type="submit" value="Show"/>
		</center>
		<%
			if(request.getParameter("age") != null) {
				int age = Integer.parseInt(request.getParameter("age"));
				out.println("Age is: " + age);
			}
		%>
	</form>
</body>
</html>