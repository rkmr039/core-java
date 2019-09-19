<%@page import="com.hcl.hms.Room"%>
<%@page import="com.hcl.hms.HotelCrud"%>
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
	HotelCrud crud = new HotelCrud();
	String rid = crud.generateRoomId(); 
	%>
	<form method="post" action="CreateRoom.jsp">
		<center>
			RoomId : <input type="text" name="roomId" readonly="readonly" value="<%= rid %>" /><br/><br/>
			Room Type : <select name="roomType">
							<option value="Single">Single</option>
							<option value="Double">Double</option>
						</select>
						
			Cost Per Day : <input type="text" name="costPerDay" /><br/><br/>
			Status : <input type="text" name="status" readonly="readonly" value="Available" /><br/><br/>
			<input type="submit" value="Create" /><br/><br/>
			
		</center>
	</form>
	<%
		if(request.getParameter("roomId") != null &&
				request.getParameter("roomType") != null &&
				request.getParameter("costPerDay") != null &&
				request.getParameter("status") != null ) {
			Room room = new Room();
			room.setRoomId(request.getParameter("roomId"));
			room.setType(request.getParameter("roomType"));
			room.setStatus(request.getParameter("status"));
			room.setCostPerDay(Integer.parseInt(request.getParameter("costPerDay")));
			out.println(crud.addRooms(room));  
		}
		
	%>
</body>
</html>