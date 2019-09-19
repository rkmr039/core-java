package com.hcl.inventory;

public class PlaceOrder {

	private String stockId;
	private int qntyAvail;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public int getQntyAvail() {
		return qntyAvail;
	}
	public void setQntyAvail(int qntyAvail) {
		this.qntyAvail = qntyAvail;
	}
	
	public String placeOrder() {
		return InventryBal.placeOrderBal(stockId, qntyAvail);
	}
}
