package com.hcl.library;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HttpSession session = null;
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//loginBal(user);
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		OutputStream out = response.getOutputStream();
		User user = new User();
		user.setUsername(userName);
		user.setPassword(passWord);
		String[] result = LibraryBal.loginBal(user);
		if (result[0].equals("Logged In...")) {
			session = request.getSession(true);
			session.setAttribute("name",result[1]);
			RequestDispatcher dip = request.getRequestDispatcher("MenuServlet");
			dip.forward(request, response);
		} else{
			((ServletOutputStream) out).println("Invalid Credentials...");
			RequestDispatcher dip = request.getRequestDispatcher("login.html");
			dip.include(request, response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
