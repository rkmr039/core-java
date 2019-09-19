<%@page import="com.hcl.ems.Employ"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@page import="com.hcl.ems.Leaves"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
    background:#333;
}
#mainDiv{
	top:0;
	right:0;
	left:0;
	bottom:0;
	margin:auto;
	position:absolute;
}

</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply leave | EMS</title>
</head>
<body>
	<%
		String checked = request.getParameter("leaveId");
		int leaveId = 0;
		try {
			leaveId = Integer.parseInt(checked);
		} catch (NumberFormatException | NullPointerException e)
		{
			%>
				<jsp:forward page="dashboard.jsp"></jsp:forward>
			<%
		}
		Leaves l = EmsBal.getLeaveByIdBal(leaveId);
	 	Employ e = EmsBal.getAccountInfoBal(l.getEmpId());
	 	
	 	%>
	<form method="post" action="ApprovDeny.jsp"> 	
	<div class="container border w-75 h-50" id="mainDiv">
		<div class="row">
			<div class="col-sm-12" style="text-align:center"><h1>Approve Deny Leaves</h1></div>
		</div>
		<div class="row mt-4">
			<input style="display:none" value="<%=l.getLeaId() %>" name="leaveId"></input>
		</div>
		<div class="row">
			<div class="col-sm-3">Employ Id:</div>
			<div class="col-sm-3"><%=l.getEmpId() %></div>
			<div class="col-sm-3">Start Date</div>
			<div class="col-sm-3"><%=l.getStartDate() %></div>
		</div>
		<div class="row">
			<div class="col-sm-3">Employ Name:</div>
			<div class="col-sm-3"><%=e.getEmpName() %></div>
			<div class="col-sm-3">End Date</div>
			<div class="col-sm-3"><%=l.getEndDate() %></div>
			
		</div>
		<div class="row">
			<div class="col-sm-3">Leave Balance:</div>
			<div class="col-sm-3"><%=e.getEmpLeaveBalance() %></div>
			<div class="col-sm-3">Number of Days</div>
			<div class="col-sm-3"><%=l.getNoDays() %></div>
		</div>
		<div class="row">
			<div class="col-sm-3">Comments:</div>
			<div class="col-sm-3" ><input type="text" name="comments"></div>
			<div class="col-sm-3">Leave Type</div>
			<div class="col-sm-3"><%=l.getType() %></div>
			
		</div>
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-3"></div>
			<div class="col-sm-3">Leave Reason</div>
			<div class="col-sm-3"><%=l.getReason() %></div>
		</div>
		<div class="row" style="margin-top:50px;">
			<div class="col-sm-3 "><input class="btn btn-primary" type="submit" value="Approve" name="approv"/></div>
			<div class="col-sm-3 "><input class="btn btn-primary" type="submit" value="Deny" name="approv"/></div>
			<div class="col-sm-3 "><input class="btn btn-primary" type="reset" onClick="javascript:window.location.href='dashboard.jsp'" value="Cancel" name="cancel"/></div>
		</div>
	</div> 	
		
	</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>

</body>
</html>