package com.hcl.loginlogoutdemo;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		RequestDispatcher rd = null; 
		OutputStream out = response.getOutputStream();
		String result="";
		if(name.equals("1") && pwd.equals("1")) {
			//result="Logged In";
			((ServletOutputStream) out).println(name);
			rd = request.getRequestDispatcher("DashboardServlet");
			rd.forward(request, response);
		} else {
			result="Invalid Login Details";
			((ServletOutputStream) out).println(result);
			rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		//rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
