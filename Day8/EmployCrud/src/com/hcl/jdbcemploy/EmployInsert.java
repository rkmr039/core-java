package com.hcl.jdbcemploy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {
  /**
   * main method .
   * @param args .
   */

  public static void main(String[] args) {
    Connection con = new DaoConnection().getConnection();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number");
    int empno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Employ Name");
    String name = sc.nextLine();
    System.out.println("Enter Department");
    String dept = sc.nextLine();
    System.out.println("Enter Designation");
    String desig = sc.nextLine();
    System.out.println("Enter Basic Salary");
    int basic = Integer.parseInt(sc.nextLine());
   
    String cmd = "insert into Employ values (?,?,?,?,?)";
    
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      
      ps.setInt(1, empno);
      ps.setString(2, name);
      ps.setString(3, dept);
      ps.setString(4, desig);
      ps.setInt(5, basic);
      
      ps.executeUpdate();
      System.out.println("Inserted Sucessfully");
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
