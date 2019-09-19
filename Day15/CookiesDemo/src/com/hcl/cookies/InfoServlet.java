package com.hcl.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		String[] hobbies = request.getParameterValues("hobbies");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		
		out.println("Employ ID   : " + id + "<br/>");
		out.println("Employ Name : " + name + "<br/>");
		for (String string : hobbies) {
			out.println("&nbsp;&nbsp;-&nbsp;" + string + "<br/>");
		}
		out.println("Gender  : " + gender +  "<br/>");
		out.println("City    : " + city +"<br/>");
		out.println("State   : " + state +"<br/>");
		out.println("Country : " + country +"<br/>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
