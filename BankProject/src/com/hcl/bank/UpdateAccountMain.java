package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
  
  /**
   * main() .
   * @param args .
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account No. ");
    int accno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter City ");
    String city = sc.nextLine();
    System.out.println("Enter State ");
    String state = sc.nextLine();
    AccountBal.updateAccountBal(accno, city, state);
    System.out.println("Updated Successfully");
    sc.close();
  }
}
