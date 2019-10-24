package com.hcl.jdbdepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDepartment {
  /**
   * main.
   * @param args .
   */

  public static void main(String[] args) {
    int deptno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Department No ");
    deptno = sc.nextInt();
    Connection con = new DaoConnection().getConnection();
    String cmd = "delete from department where deptno = ?";
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setInt(1,deptno);
      ps.executeUpdate();
      System.out.println("Deleted Successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
