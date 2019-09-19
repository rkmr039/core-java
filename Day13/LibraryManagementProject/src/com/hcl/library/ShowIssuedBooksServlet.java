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
 * Servlet implementation class ShowIssuedBooksServlet
 */
public class ShowIssuedBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowIssuedBooksServlet() {
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
		String[] checked = request.getParameterValues("issueBox");
		String res="";
		OutputStream out = response.getOutputStream();
		try{
			if(checked.length == 0) {}
		} catch(NullPointerException e) {
			rd = request.getRequestDispatcher("IssueBooks.html");
			rd.forward(request, response);
		}
		
		for (String id : checked) {
			int Id = Integer.parseInt(id);
			boolean i = LibraryBal.issueBookBal(name,Id);
			if(i) {
				res +="<br/><h5>Book ID(" + Id + ") issued.</h5><br/>";
			} else {
				res +="<br/><h5>Book ID(" + Id + ") already issued.</h5><br/>";
			}
		} 
		((ServletOutputStream) out).println(res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
