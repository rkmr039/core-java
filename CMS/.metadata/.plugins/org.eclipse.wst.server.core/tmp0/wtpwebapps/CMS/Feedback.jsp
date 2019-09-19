<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.cms.CollegeCrud"%>
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
		CollegeCrud crud = new CollegeCrud();
		String fid = crud.getFeedbackId();
		List<String> instructors = crud.getInstructors();
	%>
	<form action="Feedback.jsp" name="formFeedback"/>
		Feedback ID : <input type="text" name="fid" readonly value=<%=fid %> /><br/>
		Student Name:<input type="text" name="studentName" /><% out.println(request.getParameter("studentName")); %><br/><br/>
		Instructor : <select id="insDropDown" name="insDropDown" onchange="getSubjects()">
						<option>Select Any One</option>
						<%
												
							for(String ins : instructors) {
								%>
								
								<option value="<%=ins%>"> <%=ins%> </option>
							
							<%
							}
							%>	
					</select>	
	<%
		session.setAttribute("fid",fid);
	    session.setAttribute("studentName",request.getParameter("studentName"));
	    session.setAttribute("ins", request.getParameter("insDropDown"));   
    %>
	</form>
	<script>
		function getSubjects(){
			document.formFeedback.submit();
		}
	</script>
	
   <form mtehod="post" action="ConfirmFeedbackForm.jsp"><br/><br/>
	Please Provide Feedback:<br/><br/>
		Subjects : <select id="subDropDown" name="subDropDown" >
						<%
							List<String> list = new CollegeCrud().getSubjectsByInstructor(request.getParameter("insDropDown"));
							for(String s : list) {
								
								%>
								
								<option value="<%=s%>"> <%=s%> </option>
							
							<%
							}
							%>		
					</select>	<br/><br/>
	    <input type="radio" id="Choice1"
     name="feedback" value="Excellent">
    <label for="Choice1">Excellent</label>

    <input type="radio" id="Choice2"
     name="feedback" value="Good">
    <label for="Choice2">Good</label>

    <input type="radio" id="Choice3" 
     name="feedback" value="Adequate">
    <label for="Choice3">Adequate</label>

    <input type="radio" id="Choice4"
     name="feedback" value="Inadequate">
    <label for="Choice4">Inadequate</label>
	<input type="submit" value="Show" />
</form> 	
	
</body>
</html>