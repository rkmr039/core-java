package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
  /**
   * main(). for searching record in account table.
   * @param args .
   */

  public static void main(String[] args) {
    int accountNo;
    System.out.println("Enter Account No ");
    Scanner sc = new Scanner(System.in);
    accountNo = sc.nextInt();
    Accounts objAccounts = AccountBal.searchAccountBal(accountNo);
    if (objAccounts != null) {
   /*   System.out.println("First Name " + objAccounts.getFirstName());
      System.out.println("Last name " + objAccounts.getLastName());
      System.out.println("City " + objAccounts.getCity());
      System.out.println("State " + objAccounts.getState());
      System.out.println("Amount " + objAccounts.getAmount());
      System.out.println("CheqFacil " + objAccounts.getCheqFacil());
      System.out.println("Account Type " + objAccounts.getAccountType());*/
      System.out.println(objAccounts);
    }
    sc.close();
  }
}
