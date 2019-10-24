package com.hcl.jdbdepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDepartment {
  /**
   * main method .
   * @param args .
   */

  public static void main(String[] args) {
    Connection con = new DaoConnection().getConnection();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Department Number");
    int deptno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Department Location");
    String loc = sc.nextLine();
    System.out.println("Enter Department Head");
    String head = sc.nextLine();
   
    String cmd = "update department set loc = ?, head = ? where deptno = ?";
    
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      
      ps.setInt(3, deptno);
      ps.setString(1, loc);
      ps.setString(2, head);
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