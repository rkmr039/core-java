<%@page import="com.hcl.cms.CollegeCrud"%>
<%@page import="com.hcl.cms.Feedback"%>
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
<%
		String fid = (String)session.getAttribute("fid");
		String ins = (String)session.getAttribute("ins");
		String studentName = (String)session.getAttribute("studentName");
		String fbvalue = request.getParameter("feedback");
		String subject = request.getParameter("subject");
		Feedback f = new Feedback();
		f.setFid(fid);
		f.setFbvalue(fbvalue);
		f.setInstructor(ins);
		f.setStudentName(studentName);
		f.setSubject(subject);
		CollegeCrud crud = new CollegeCrud();
		boolean flag = crud.addFeedback(f);
		if(flag) {
			%>
			<jsp:forward page="FeedbackDashboard.jsp"></jsp:forward>
			<%
		}
		
	%>
</body>
</html>