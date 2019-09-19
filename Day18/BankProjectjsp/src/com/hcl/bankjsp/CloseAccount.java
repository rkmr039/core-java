package com.hcl.bankjsp;

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
 * Servlet implementation class CloseAccountServlet
 */
public class CloseAccount {
  private int accno;
  
  public int getAccno() {
	return accno;
  }
  public void setAccno(int accno) {
	this.accno = accno;
  }
  public String closeAccount() {
		return AccountBal.closeAccountBal(accno);
  }
}
