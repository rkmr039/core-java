package com.hcl.inventry;

public class Stock {
  
  private String stockId;
  private String itemName;
  private double price;
  private int quantityAvail;
public String getStockId() {
	return stockId;
}
public void setStockId(String stockId) {
	this.stockId = stockId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getquantityAvail() {
	return quantityAvail;
}
public void setquantityAvail(int quantityVail) {
	this.quantityAvail = quantityVail;
}
@Override
public String toString() {
	return "Stock [stockId=" + stockId + ", itemName=" + itemName + ", price=" + price + ", quantityAvail="
			+ quantityAvail + "]";
}
  
}
