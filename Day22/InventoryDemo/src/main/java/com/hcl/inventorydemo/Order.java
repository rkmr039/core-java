package com.hcl.inventorydemo;

public class Order {
	private int qtyord,orderid;
	private Product objProduct;
	
	public int getQtyord() {
		return qtyord;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Product getObjProduct() {
		return objProduct;
	}
	public void setObjProduct(Product objProduct) {
		this.objProduct = objProduct;
	}
	
	public void display() {
		System.out.println("Quantity Order : " + qtyord + ", Orderid = " + orderid );
		objProduct.product();
	}
}