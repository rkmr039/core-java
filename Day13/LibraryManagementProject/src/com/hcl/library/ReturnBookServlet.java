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
 * Servlet implementation class ReturnBookServlet
 */
public class ReturnBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("MenuServlet");
		rd.include(request, response);
		
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		OutputStream out = response.getOutputStream();
		String[][] result = LibraryBal.showIssuedBooksBal(name);
		((ServletOutputStream) out).println("<br/><br/>");
		((ServletOutputStream) out).println("<form method='post' action='ShowReturnedBooksServlet'>");
		((ServletOutputStream) out).println("<table border='1'>");
		((ServletOutputStream) out).println("<tr>");
		((ServletOutputStream) out).println("<th>ID</th>");
		((ServletOutputStream) out).println("<th>From Date</th>");
		((ServletOutputStream) out).println("<th>Return</th>");
		((ServletOutputStream) out).println("</tr>");
		for (String[] res : result) {
			((ServletOutputStream) out).println("<tr>");
			((ServletOutputStream) out).println("<td>" + res[0] + "</td>");
			((ServletOutputStream) out).println("<td>" + res[1] + "</td>");
			((ServletOutputStream) out).println("<td><input type='checkbox'  name='returnBox' value='"+ res[0] +"' /></td>");
			((ServletOutputStream) out).println("</tr>");
		}
		((ServletOutputStream) out).println("</table>");
		((ServletOutputStream) out).println("<br/><br/><input type='submit' value='Return' />");
		((ServletOutputStream) out).println("</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
