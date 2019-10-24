package com.hcl.bank;

public class AccountBal {
  public static String createAcccountBal(Accounts objAccounts) {
    return new AccountDao().createACoount(objAccounts);
  }
  
  public static int generateAccountNoBal() {
    return new AccountDao().generateAccountNoDao();
  }
  
  public static Accounts searchAccountBal(int accno) {
    return new AccountDao().searchAccountDao(accno);
  }
  
  public static String updateAccountBal(int accno, String city, String state) {
    return new AccountDao().updateAccount(accno, city, state);
  }
  
  public static String closeAccountBal(int accno) {
    return new AccountDao().closeAccountDao(accno);
  }
  
  public static String depositeAccountBal(int accno, int depositeAmount) {
	  return new AccountDao().depositeAccountDao(accno, depositeAmount);
  }
  
  public static String withdrawnAccountBal(int accno, int amount) {
	  return new AccountDao().withdrawAccountDao(accno, amount);
  }
}