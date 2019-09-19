package com.hcl.library;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MenuServlet
 */
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OutputStream out = response.getOutputStream();
		HttpSession session = request.getSession();
		RequestDispatcher dip = null;
		String name = (String)session.getAttribute("name");
		
		if( name == null || name.isEmpty()) { // working
			//System.out.println("LoggedOut");
			((ServletOutputStream) out).println("Please Login First");
			dip = request.getRequestDispatcher("login.html");
			dip.forward(request, response);
		} else {
			((ServletOutputStream) out).println("Welcome : " + name);
			dip = request.getRequestDispatcher("menu.html");
			dip.include(request, response);
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
