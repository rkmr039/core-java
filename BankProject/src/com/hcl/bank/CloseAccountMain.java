package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {
  
  /**
   * before closing account check that account is activated or not.
   * @param args .
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account No ");
    int accno = sc.nextInt();
    System.out.println(AccountBal.closeAccountBal(accno));
    sc.close();
  }
}
