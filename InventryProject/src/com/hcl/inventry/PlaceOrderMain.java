package com.hcl.inventry;

import java.util.Scanner;

public class PlaceOrderMain {
  
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Stock Id");
	String stockId = sc.nextLine();
	System.out.println("Enter Quantity Ordered ");
	int qnty = Integer.parseInt(sc.nextLine());
	System.out.println(InventryBal.placeOrderBal(stockId,qnty));
	sc.close();
  }
}
