package com.hcl.inventorydemo;

public class Product {
	private String product;
	private int qntyAvail;
	private int price;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQntyAvail() {
		return qntyAvail;
	}
	public void setQntyAvail(int qntyAvail) {
		this.qntyAvail = qntyAvail;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void product() {
		System.out.println("Product : " + product + ", QuantityAvailable : " + qntyAvail + ", Price : " + price );
	}
	
}
