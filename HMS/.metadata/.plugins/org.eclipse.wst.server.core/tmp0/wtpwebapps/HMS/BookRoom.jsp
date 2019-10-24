<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hcl.hms.Booking"%>
<%@page import="com.hcl.hms.Room"%>
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
		String bid = crud.generateBookingId();
		List<Room> rooms = crud.getAvailableRooms();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
	%>	
	<form method="post" action="BookRoom.jsp">
		<center>
			Book Id :  <input type="text" name="bookId" readonly="readonly" value="<%= bid %>" /><br/><br/>
			Room Id :  <select name="roomId">
							<%
								for(Room room : rooms) {				
							%>
							
											<option value="<%= room.getRoomId()	%>"><%= room.getRoomId()	%></option>
									  
									   
							<% } // forEach loop closing %>
						</select><br/><br/>
			Customer Name : <input type="text" name="custName"	/><br/><br/>
			Customer City :	<input type="text" name="city"	/><br/><br/>
			Book Date	  : <input type="date" name="bookDate" min=<%=date %>	/><br/><br/>
			<input type="submit" value="Book Room"	/><br/><br/>	   
		</center>
	</form>
	<%
		if( request.getParameter("bookId") != null &&
			request.getParameter("roomId") != null &&
			request.getParameter("custName") != null &&
			request.getParameter("city") != null &&
			request.getParameter("bookDate") != null ) {
			
			Booking obj = new Booking();
			obj.setBookId(request.getParameter("bookId"));
			obj.setRoomId(request.getParameter("roomId"));
			obj.setCustName(request.getParameter("custName"));
			obj.setCity(request.getParameter("city"));
			
			Date bookDate = sdf.parse(request.getParameter("bookDate"));
			obj.setBookDate(bookDate);
			
			boolean status = crud.bookRoom(obj);
			if(status) {
				out.println("Booking Date : " + obj.getBookDate());
				out.println("Booking ID : " + obj.getBookId());
			} else {
				out.println("Booking not possible");
			}
		}
		
	%>
</body>
</html>