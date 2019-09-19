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
 * Servlet implementation class DepositeAccountServlet
 */
public class DepositAccount {
  private int accno;
  private int amount;
  
  public int getAccno() {
	return accno;
  }
  public void setAccno(int accno) {
	this.accno = accno;
  }
  public int getAmount() {
	return amount;
  }
  public void setAmount(int amount) {
	this.amount = amount;
  }

  public String depositAccount() {
    return AccountBal.depositAccountBal(accno, amount);	
  }
	

}
