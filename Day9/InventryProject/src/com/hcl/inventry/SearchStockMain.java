package com.hcl.inventry;

import java.util.Scanner;

public class SearchStockMain {
  /**
   * main method for adding stock.
   */
  public static void main(String[] args) {
    System.out.println("Enter StockID ");
    Scanner sc = new Scanner(System.in);
    String stockid = sc.nextLine();
    Stock stock = InventryBal.searchStockBal(stockid);
    System.out.println(stock);
  }
}