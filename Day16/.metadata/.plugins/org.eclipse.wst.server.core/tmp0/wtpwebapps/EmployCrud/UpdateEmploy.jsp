<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jspcrud.DaoConnection"%>
<%@page import="java.sql.Connection"%>
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
		int empno = Integer.parseInt(request.getParameter("empno"));
		Connection con = DaoConnection.getConnection();
		String cmd = "SELECT * FROM employ WHERE empno=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1,empno);
		ResultSet rs= pst.executeQuery();
		rs.next();
	%>
	<form method="get" action="UpdateEmploy.jsp">
		<center>
			Employ No:
			<input type="text"  value="<%=rs.getInt("empno") %>" readonly  name="empno"/><br/><br/>
			Employ Name:
			<input type="text"  value="<%=rs.getString("name")%>" name="name"/><br/><br/>
			Department:
			<input type="text"  value="<%=rs.getString("dept")%>" name="dept"/><br/><br/>
			Designation:
			<input type="text"  value="<%=rs.getString("desig")%>" name="desig"/><br/><br/>
			Salary:
			<input type="text"  value="<%=rs.getInt("basic")%>" name="basic"/><br/><br/>
			<input type="submit" value="Update"/><br/><br/>
		</center>
	</form>

		<%
		if(request.getParameter("empno") != null && request.getParameter("basic") != null) {
			con = DaoConnection.getConnection();
			cmd = "update employ set name=?, dept=?, desig=?, basic=? where empno = ?";
			pst = con.prepareStatement(cmd);
			
			String name = request.getParameter("name");
			String dept = request.getParameter("dept");
			String desig = request.getParameter("desig");
			int basic = Integer.parseInt(request.getParameter("basic"));
			
			
			pst.setString(1, name);
			pst.setString(2, dept);
			pst.setString(3, desig);
			pst.setInt(4, basic);
			pst.setInt(5,empno);
			pst.executeUpdate();
			out.println("<br/><b>*****UPDATED*****</b><br/>");
		}
		%>
		
	</table>
</body>
</html>