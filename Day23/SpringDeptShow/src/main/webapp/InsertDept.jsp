<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="insertDept.hcl">
		<center>
			Department No:<input type="text" name="deptno"><br/><br/>
			Department Name:<input type="text" name="dname"><br/><br/>
			Department Location:<input type="text" name="loc"><br/><br/>
			Department Head:<input type="text" name=head"><br/><br/>
			<input type="submit" value="Insert"/>
		</center>
	</form>
</body>
</html>