package com.hcl.jdbcemploy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmploy {
  /**
   * main.
   * @param args .
   */

  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ No ");
    empno = sc.nextInt();
    Connection con = new DaoConnection().getConnection();
    String cmd = "delete from Employ where empno = ?";
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setInt(1,empno);
      ps.executeUpdate();
      System.out.println("Deleted Successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
