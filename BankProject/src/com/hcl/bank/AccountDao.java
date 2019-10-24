package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {
  
  PreparedStatement pst;
  Connection con;
  
  /**
   * createAccount will create a account in DB account table.
   * @param objAccounts .
   * @return successful or error message. 
   */

  public String createACoount(Accounts objAccounts) {
    con = DaoConnection.getConnection();
    String cmd = "INSERT INTO accounts(AccountNo,FirstName,LastName,City,"
           + "State,Amount,CheqFacil,AccountType) VALUES(?,?,?,?,?,?,?,?);";
    String result = "";
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1, objAccounts.getAccountNo());
      pst.setString(2, objAccounts.getFirstName());
      pst.setString(3, objAccounts.getLastName());
      pst.setString(4, objAccounts.getCity());
      pst.setString(5, objAccounts.getState());
      pst.setInt(6, objAccounts.getAmount());
      pst.setString(7, objAccounts.getCheqFacil());
      pst.setString(8, objAccounts.getAccountType());
      pst.executeUpdate();
      result = "Account Created Successfully ";
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;  
  }
  
  /**
   * generate a new account number every time and return same.
   * @return account number generated.
   */

  public int generateAccountNoDao() {
    con = DaoConnection.getConnection();
    int accno = 0;
    String cmd = "SELECT CASE WHEN MAX(accountNo) IS NULL "
            + " THEN 1 ELSE MAX(accountNo) + 1 END accno "
            + " FROM Accounts ";
    try {
      pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      accno = rs.getInt("accno");
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return accno;
  }
  
  /**
   * search for an account from DB accounts table. 
   * @param accno from searching accounts.
   * @return Account object.
   */
  
  public Accounts searchAccountDao(int accno) {

    con = DaoConnection.getConnection();
    String cmd = "SELECT * FROM Accounts WHERE accountNo = ?;";
    Accounts objAccount = null;
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1, accno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        objAccount = new Accounts();
        objAccount.setAccountNo(rs.getInt("accountNo"));
        objAccount.setFirstName(rs.getString("firstName"));
        objAccount.setLastName(rs.getString("lastName"));
        objAccount.setCity(rs.getString("city"));
        objAccount.setState(rs.getString("state"));
        objAccount.setAmount(rs.getInt("amount"));
        objAccount.setCheqFacil(rs.getString("CheqFacil"));
        objAccount.setAccountType(rs.getString("AccountType"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return objAccount;
  }
  
  /**
   * update account details.
   * first check account number exist in table or not. 
   * @param accno of client to be updated.
   * @param city Updated City info.
   * @param state Updated State info.
   * @return update status.
   */
  
  public String updateAccount(int accno, String city, String state) {
    con = DaoConnection.getConnection();
    String cmd = "UPDATE Accounts set city = ?, state = ? WHERE accountNo = ?;";
    String result = "";
    try {
      pst = con.prepareStatement(cmd);
      pst.setString(1, city);
      pst.setString(2, state);
      pst.setInt(3, accno);
      pst.executeUpdate();
      result = "Account Updated";
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }

  /**
   * this method will change the status of account to inactive.
   * @param accno of account to be closed.
   * @return success message.
   */
  
  public String closeAccountDao(int accno) {
    con = DaoConnection.getConnection();
    String cmd = "UPDATE Accounts set Status='Inactive' WHERE accountNo=?;";
    String result = null;
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1, accno);
      pst.executeUpdate();
      result = "Status Closed";
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }
  
  /**
   * this method will deposit depositedAmount in account and update the trans table.
   * before updating amount check account is activated or not. 
   * @param accno of account to be deposited. 
   * @param depositeAmount .
   * @return deposit message. 
   */
  
  public String depositeAccountDao(int accno,int depositeAmount) {
    con = DaoConnection.getConnection();
    String result = "";
    String cmd = "UPDATE Accounts SET amount=amount+? "
        + "WHERE accountNo=?;";
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1, depositeAmount);
      pst.setInt(2, accno);
      pst.executeUpdate();
      cmd = "INSERT INTO trans(AccountNo, TransAmount,"
        + "TransType) values(?,?,?);";
      pst = con.prepareStatement(cmd);
      pst.setInt(1, accno);
      pst.setInt(2, depositeAmount);
      pst.setString(3, "C");
      pst.executeUpdate();
      result = "Amount Credited";
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result; 
  }
  
  public String withdrawAccountDao(int accno, int withdrawnAmount) {
    con = DaoConnection.getConnection();
    String result = "";
    Accounts objAccounts = searchAccountDao(accno);
    if (objAccounts != null) {
      int amount = objAccounts.getAmount();
      if (amount - withdrawnAmount >= 1000) {
        String cmd = "UPDATE Accounts SET amount=amount-? "
            + "WHERE accountNo=?;";
        try {
          pst = con.prepareStatement(cmd);
          pst.setInt(1, withdrawnAmount);
          pst.setInt(2, accno);
          pst.executeUpdate();
          cmd = "INSERT INTO trans(AccountNo, TransAmount,"
             + "TransType) values(?,?,?);";
          pst = con.prepareStatement(cmd);
          pst.setInt(1, accno);
          pst.setInt(2, withdrawnAmount);
          pst.setString(3, "D");
          pst.executeUpdate();
          result = "Amount Debited";
        } catch (SQLException e) {
          e.printStackTrace();
        }
      } else {
    	result = "Insufficient Balance";
      }
    } else {
      result = "Account No Not Found";
    }
    return result;
  }
}
