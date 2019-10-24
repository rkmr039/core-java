package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UsersAuth {
  /**
   * main() entry point. 
   * @param args command line arguments. not required now.
   */

  public static void main(String[] args) {
    String username;
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Username");
    username = sc.nextLine();
    System.out.println("Enter Password");
    String secCode;
    secCode = sc.nextLine();

    // load the Driver
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
            "root","root");
      String cmd = "SELECT * FROM Users WHERE username =? AND password =?";// 
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setString(1,  username);
      ps.setString(2,  secCode);
      ResultSet rs = ps.executeQuery(); 
      if (rs.next()) {
        System.out.println("=======Login Successful=========");
      } else {
        System.out.println("=======Invalid Login Details======");
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    sc.close();
  }
 
}
