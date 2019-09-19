<%@page import="com.hcl.ems.Employ"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.ems.EmsDao"%>
<%@page import="com.hcl.ems.Leaves"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/myLeaves.css" /> 
<style>
/* 	#applyButton{
	position:absolute;
	
	right:30px;/* 
	border:1px solid black; */ */
	
}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script>
function checkOnlyOne(b){

	var x = document.getElementsByClassName('daychecks');
	var i;

	for (i = 0; i < x.length; i++) {
	  if(x[i].value != b) x[i].checked = false;
	}
	}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="table-wrapper-scroll-y my-custom-scrollbar">
	<form method="post" action="ApprovDenyLeaves.jsp">
	<table class="table table-striped mb-0" border="1" bordercolor=white>
		<%
		int mgrId = Integer.parseInt((String)session.getAttribute("EMP_ID"));
	 	List<Leaves> leaves = EmsBal.getEmployLeavesBal(mgrId);
	 	int idCurrent;
	 	int idPrevious = 0;
	 	for(Leaves l : leaves) {
	 		idCurrent = l.getEmpId();
	 		Employ e = EmsBal.getAccountInfoBal(l.getEmpId());
	 		if(!(idCurrent == idPrevious)) {
	 			%>
	 			<tr class="table-primary">
					<th colspan="2">Employ ID:</th><%out.println("<td>"+ l.getEmpId() +"</td>"); %>
					<th colspan="2">Employ Name:</th><%out.println("<td colspan='2'>"+e.getEmpName()+"</td>");%>
					<th colspan="4">Employ Leave Balance:</th><%out.println("<td colspan='2'>"+e.getEmpLeaveBalance()+"</td>"); %>
				</tr>
				<tr class="table-primary">
					<th colspan="1"></th>
					<th colspan="1">Leave ID:</th>
					<th colspan="1">No of Days:</th>
					<th colspan="1">Start Date</th>
					<th colspan="1">End Date:</th>
					<th colspan="2">Leave Type</th>
					<th colspan="1">Status:</th>
					<th colspan="3">reason:</th>
					<td></td>
				</tr>
	 			<%}
	 			if(l.getStatus().equals("PENDING") ) {
	 			if(l.getStatus().equals("APPROVED")) {
	 				out.println("<tr class='table-success'>");
	 			} else if(l.getStatus().equals("DENIED")) {
	 				out.println("<tr class='table-danger'>");
	 			}
	 			else {
	 				out.println("<tr>");
	 			}
	 				out.println("<th colspan='1'></th>");
		 			out.println("<td colspan='1'>"+ l.getLeaId() +"</td>");
		 			out.println("<td colspan='1'>"+l.getNoDays()+"</td>");
		 			out.println("<td colspan='1'>"+l.getStartDate()+"</td>");
		 			out.println("<td colspan='1'>"+l.getEndDate()+"</td>");
		 			out.println("<td colspan='2'>"+l.getType()+"</td>");
		 			out.println("<td colspan='1'>"+l.getStatus()+"</td>");
		 			out.println("<td colspan='3'>"+l.getReason()+"</td>");
		 			if(l.getStatus().equals("DENIED")) {
		 				out.println("<td><input disabled class='daychecks' onclick='checkOnlyOne(this.value);' type='checkbox' name='leaveId' value='"+ l.getLeaId() +"'/></td>");
		 			} else {
		 				out.println("<td><input  class='daychecks' onclick='checkOnlyOne(this.value);' type='checkbox' name='leaveId' value='"+ l.getLeaId() +"'/></td>");
		 			}
	 			out.println("</tr>"); 
	 			}
	 			idPrevious = l.getEmpId();
	 	}
	 	%>
	 	</table>
	 <%
	 	if(leaves.size() == 0) {
	 %>	
	 <div id="applyButton">	
	 <input  class='btn btn-primary' disabled  onClick='javascript:window.location.href=\"ApprovDenyLeaves.jsp\"' type='submit' value='Approv / Deny' />
	 </div>	<%
	 } else {%>
	 <div id="applyButton">	
	 <input  class='btn btn-primary' onClick='javascript:window.location.href=\"ApprovDenyLeaves.jsp\"' type='submit' value='Approv / Deny' />
	 </div>	
	 <%}%>
	 </form>	
	
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	
</body>
</html>