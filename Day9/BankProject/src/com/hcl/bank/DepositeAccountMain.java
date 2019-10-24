package com.hcl.bank;

import java.util.Scanner;

public class DepositeAccountMain {
  
  /**
   * before depositing amount check account is activate or not.
   * @param args .
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account ");
    int accno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Amount ");
    int depositeAmount = Integer.parseInt(sc.nextLine());
    System.out.println(AccountBal.depositeAccountBal(accno, depositeAmount));
    sc.close();
  }
}
