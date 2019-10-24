package com.hcl.inventry;

import java.util.Scanner;

public class AddStockMain {
  /**
   * main method for adding stock ti DB.
   * @param args .
   */

  public static void main(String[] args) {
    String stockId;
    Stock stock = new Stock();
    stockId = InventryBal.generateStockIdBal();
    stock.setStockId(stockId);
    System.out.println("Enter Item Name");    
    Scanner sc = new Scanner(System.in);
    String itemName = sc.nextLine();
    stock.setItemName(itemName);
    double price;
    System.out.println("Enter Price ");
    price = Double.parseDouble(sc.nextLine());
    stock.setPrice(price);
    System.out.println("Enter Quantity");
    int quantityAvail = sc.nextInt();
    stock.setQuantityAvail(quantityAvail);
    System.out.println(InventryBal.addStockBal(stock));
  }
}
