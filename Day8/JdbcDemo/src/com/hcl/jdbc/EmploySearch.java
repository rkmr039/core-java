package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
  /**
   * main() entry point. 
   * @param args command line arguments. not required now.
   */

  public static void main(String[] args) {
    int empno;
    System.out.println("Enter Employ No.");
    Scanner sc = new Scanner(System.in);
    empno = sc.nextInt();

    // load the Driver
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
            "root","root");
      String cmd = "SELECT * FROM Employ WHERE empno =?";
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setInt(1,  empno);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        System.out.println("Employ Name       : " + rs.getString("name"));
        System.out.println("Employ Department : " + rs.getString("dept"));
        System.out.println("Designation       : " + rs.getString("desig"));
        System.out.println("Salary            : " + rs.getInt("basic"));
      } else {
        System.out.println("======= Record Not Found======");
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
 
}
