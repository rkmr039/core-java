package com.hcl.jdbdepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentInsert {
  /**
   * main method .
   * @param args .
   */

  public static void main(String[] args) {
    Connection con = new DaoConnection().getConnection();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Department Number");
    int deptno = Integer.parseInt(sc.nextLine());
    System.out.println("Enter Department Name");
    String name = sc.nextLine();
    System.out.println("Enter Department Location");
    String loc = sc.nextLine();
    System.out.println("Enter Department Head");
    String head = sc.nextLine();
   
    String cmd = "insert into department values (?,?,?,?)";
    
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      
      ps.setInt(1, deptno);
      ps.setString(2, name);
      ps.setString(3, loc);
      ps.setString(4, head);
      
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