<%@page import="com.hcl.hms.Booking"%>
<%@page import="java.util.List"%>
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
	List<Booking> bookings = crud.getAllBookings();
	%>
	<table border="1">
		<tr>
			<th>BookID</th>
			<th>RoomID</th>
			<th>Customer <br/>Name</th>
			<th>City</th>
			<th>Book<br/> Date</th>
		</tr>
		<%
		for(Booking b : bookings) {
		
		%>
		<tr>
			<td><%=b.getBookId() %></td>
			<td><%=b.getRoomId() %></td>
			<td><%=b.getCustName() %></td>
			<td><%=b.getCity() %></td>
			<td><%=b.getBookDate() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>