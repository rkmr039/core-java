package com.hcl.library;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchBooksServlet
 */
public class IssueBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("MenuServlet");
		rd.include(request, response);
		
		OutputStream out = response.getOutputStream();
		// SEARCH LOGIC
		String searchType = request.getParameter("searchType");
		String searchValue = request.getParameter("searchValue");
		List<Book> books = LibraryBal.searchBookBal(searchType, searchValue);
		((ServletOutputStream) out).println("<br/><br/>");
		((ServletOutputStream) out).println("<form method='post' action='ShowIssuedBooksServlet'>");
		((ServletOutputStream) out).println("<table border='1'>");
		((ServletOutputStream) out).println("<tr>");
		((ServletOutputStream) out).println("<th>ID</th>");
		((ServletOutputStream) out).println("<th>Name</th>");
		((ServletOutputStream) out).println("<th>Author</th>");
		((ServletOutputStream) out).println("<th>Edition</th>");
		((ServletOutputStream) out).println("<th>Dept</th>");
		((ServletOutputStream) out).println("<th>TotalBooks</th>");
		((ServletOutputStream) out).println("<th>Issue</th>");
		((ServletOutputStream) out).println("</tr>");
		for (Book book : books) {
			((ServletOutputStream) out).println("<tr>");
			((ServletOutputStream) out).println("<td>" + book.getId() + "</td>");
			((ServletOutputStream) out).println("<td>" + book.getName() + "</td>");
			((ServletOutputStream) out).println("<td>" + book.getAuthor() + "</td>");
			((ServletOutputStream) out).println("<td>" + book.getEdition() + "</td>");
			((ServletOutputStream) out).println("<td>" + book.getDept() + "</td>");
			((ServletOutputStream) out).println("<td>" + book.getNos() + "</td>");
			if(book.getNos() == 0) {
				((ServletOutputStream) out).println("<td><input type='checkbox' disabled  name='issueBox' id='issue'></td>");	
			} else {
				((ServletOutputStream) out).println("<td><input type='checkbox' name='issueBox' value='"+ book.getId() + "' /></td>");
			}
			((ServletOutputStream) out).println("</tr>");
		}
		((ServletOutputStream) out).println("</table>");
		((ServletOutputStream) out).println("<input type='submit' value='Issue' id='issueButton' />");
		((ServletOutputStream) out).println("</form>");
		((ServletOutputStream) out).println("<br/><br/><span><b><h1>Please Select Atleast One Book To Issue</h1></b></span>");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
