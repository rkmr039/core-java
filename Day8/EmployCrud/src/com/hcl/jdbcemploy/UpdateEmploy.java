package com.hcl.jdbcemploy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmploy {
  /**
   * main method .
   * @param args .
   */

  public static void main(String[] args) {
    Connection con = new DaoConnection().getConnection();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number");
    int empno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Designation");
    String desig = sc.nextLine();
    System.out.println("Enter Basic Salary");
    int basic = Integer.parseInt(sc.nextLine());
   
    String cmd = "update Employ set desig = ?, basic = ? where empno = ?";
    
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      
      ps.setInt(3, empno);
      ps.setString(1, desig);
      ps.setInt(2, basic);
      ps.executeUpdate();
      System.out.println("Updated Sucessfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    try {
      con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
