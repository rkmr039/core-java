<%@page import="com.hcl.cms.FbCount"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.cms.CollegeCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String ins = (String)session.getAttribute("ins");
		// out.println(ins);
		String sub = request.getParameter("subject");
		// out.println(sub);
		CollegeCrud crud = new CollegeCrud();
		List<FbCount> res =  crud.getFeedbackCount(ins, sub);
		for(FbCount fb : res) {
			out.println(fb.getFbValue());
			out.println(fb.getCount());
		}
	%>
</body>
</html>