package com.hcl.bank;

public class Accounts {
  
  private int accountNo;
  private String firstName;
  private String lastName;
  private String city;
  private String state;
  private int amount;
  private String cheqFacil;
  private String status;
  
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  private String accountType;
  
  /**
   * toString() .
   */
  
  @Override
  public String toString() {
    return "accountNo   = " + accountNo  
      + "\nfirstName   = " + firstName
      + "\nlastName    = " + lastName
      + "\ncity        = " + city
      + "\nstate       = " + state
      + "\namount      = " + amount
      + "\ncheqFacil   = " + cheqFacil
      + "\naccountType = " + accountType;
  }

  /**
   * parameterized Constructor .
   * @param accountNo unique account number of client.
   * @param firstName first name of client.
   * @param lastName last name of client.
   * @param city client's city from address.
   * @param state client's state from address.
   * @param amount current available account balance.
   * @param cheqFacil client have check facility or not 
   * @param accountType saving or current or RD or FD account.
   */
  
  /*  public Accounts(int accountNo, String firstName, String lastName, 
        String city, String state, int amount,String cheqFacil, String accountType) {
    this.accountNo = accountNo;
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.state = state;
    this.amount = amount;
    this.cheqFacil = cheqFacil;
    this.accountType = accountType;
  }*/

  public Accounts() {
  }

  public int getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(int accountNo) {
    this.accountNo = accountNo;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getCheqFacil() {
    return cheqFacil;
  }

  public void setCheqFacil(String cheqFacil) {
    this.cheqFacil = cheqFacil;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  } 
}