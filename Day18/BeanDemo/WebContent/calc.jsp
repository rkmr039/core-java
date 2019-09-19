<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.hcl.beans.Calc" />
	<jsp:setProperty property="numOne" name="b1"/>
	<jsp:setProperty property="numTwo" name="b1"/>
	<br/>
	First Number :
	<jsp:getProperty property="numOne" name="b1"/>
	<br/>
	Second Number :
	<jsp:getProperty property="numTwo" name="b1"/>
	<br/>
	Result :
	<b>
		<%=b1.calSum() %>
	</b>
</body>
</html>