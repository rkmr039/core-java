package com.hcl.bank;

import java.util.Scanner;

public class WithdrawnAccountMain {
  
  /**
   * before withdrawing amount check account is activate or not and sufficient balance is available or not 
   * @param args .
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account ");
    int accno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Amount ");
    int withdrawnAmount = Integer.parseInt(sc.nextLine());
    System.out.println(AccountBal.withdrawnAccountBal(accno, withdrawnAmount));
    sc.close();
  }
}