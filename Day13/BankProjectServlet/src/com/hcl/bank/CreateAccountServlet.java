package com.hcl.bank;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccountServlet() {
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
		Accounts objAccount = new Accounts();
		int accno = new AccountDao().generateAccountNoDao();
		objAccount.setAccountNo(accno);
		objAccount.setFirstName(request.getParameter("firstName"));
		objAccount.setLastName(request.getParameter("lastName"));
		objAccount.setCity(request.getParameter("city"));
		objAccount.setState(request.getParameter("state"));
		int amount  = Integer.parseInt(request.getParameter("amount"));
		
		objAccount.setAmount(amount);
		objAccount.setCheqFacil(request.getParameter("cheqFacil"));
		objAccount.setAccountType(request.getParameter("accountType"));
		String result = AccountBal.createAcccountBal(objAccount);
		//System.out.println(result);
		
		((ServletOutputStream) out).println("<br/>"+result);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
