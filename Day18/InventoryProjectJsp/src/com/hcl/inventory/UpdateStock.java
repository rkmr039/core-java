package com.hcl.inventory;

public class UpdateStock {
  private String stockid;
  private int qnty;
  private double price;
  
	
  public String getStockid() {
	return stockid;
}


public void setStockid(String stockid) {
	this.stockid = stockid;
}


public int getQnty() {
	return qnty;
}


public void setQnty(int qnty) {
	this.qnty = qnty;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String updateStock() {
	  return InventryBal.updateStockBal(stockid, price, qnty);
  }
}
