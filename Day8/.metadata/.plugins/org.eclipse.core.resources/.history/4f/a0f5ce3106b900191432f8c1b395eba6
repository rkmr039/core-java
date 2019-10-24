package com.hcl.jdbcstudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {
  /**
   * main.
   * @param args .
   */

  public static void main(String[] args) {
    int sno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student No ");
    sno = sc.nextInt();
    Connection con = new DaoConnection().getConnection();
    String cmd = "delete from student where sno = ?";
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setInt(1,sno);
      ps.executeUpdate();
      System.out.println("Deleted Successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
