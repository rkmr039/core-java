package com.hcl.inventry;

import java.util.Scanner;

public class AddStockMain {
  
  public static void main(String[] args) {
   
    String stockId = InventryBal.generateStockIdBal();
	System.out.println("Enter Item Name");
	Scanner sc = new Scanner(System.in);
	String itemName = sc.nextLine();
	System.out.println("Enter Price ");
	double price = Double.parseDouble(sc.nextLine());
	System.out.println("Enter Quantity");
	int quantityAvail = sc.nextInt();
	
	Stock stock = new Stock();
	stock.setStockId(stockId);
	stock.setItemName(itemName);
	stock.setPrice(price);
	stock.setquantityAvail(quantityAvail);
	
	System.out.println(InventryBal.addStockBal(stock));
  }
}
