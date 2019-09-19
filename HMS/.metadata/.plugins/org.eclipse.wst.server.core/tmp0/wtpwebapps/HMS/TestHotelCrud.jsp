<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.hcl.hms.Booking"%>
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
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	// working perfectly
	/* out.println(crud.generateRoomId()); */
	
	// working perfectly
	/* Room room = new Room();
	room.setRoomId(crud.generateRoomId());
	room.setType("Double");
	room.setStatus("Available");
	room.setCostPerDay(1250);
	out.println(crud.addRooms(room)); */
	
	// working perfectly
	// out.println(crud.generateBookingId());
	
	// working perfectly
	// crud.getAvailableRooms();
	
	// out.println(crud.updateRoomStatus("R001","Booked"));
	
	// working 
	/* Room room = crud.getRoomByid("R001");
	out.println(room.getRoomId());
	out.println(room.getCostPerDay());
	out.println(room.getStatus());
	out.println(room.getType()); */
	
	// BookRoom working perfectly
	/* Booking obj = new Booking();
	
	obj.setBookId(crud.generateBookingId());
	obj.setRoomId("R001");
	obj.setCustName("Rakesh Mehra");
	obj.setCity(request.getParameter("Delhi"));
	
	Date d = new Date();
	String bookDate = sdf.format(d);
	Date bookDate2 = sdf.parse(bookDate);
	obj.setBookDate(bookDate2);
	
	out.println(crud.bookRoom(obj)); */ 
	
	List<Booking> bookings = crud.getAllBookings();
	for(Booking b : bookings) {
		out.println(b.getBookId());
	}
	
	%>
</body>
</html>