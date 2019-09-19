package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class EmploySearchServlet
 */
public class EmploySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmploySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String cmd = "select * from employ where empno=?;";
			Connection con = DaoConnection.getConnection();
			response.setContentType("text/html");
			
			try {
				PreparedStatement pst = con.prepareStatement(cmd);
				pst.setInt(1, Integer.parseInt(request.getParameter("empno")));
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					PrintWriter out = response.getWriter();
					out.println("Eploy No     : " + rs.getInt("empno") + "<br/>");
					out.println("Eploy Name   : " + rs.getString("name") + "<br/>");
					out.println("Department   : " + rs.getString("dept") + "<br/>");
					out.println("Designation  : " + rs.getString("desig") + "<br/>");
					out.println("Salary       : " + rs.getInt("basic") + "<br/><hr/>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
