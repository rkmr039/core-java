package com.hcl.jdbdepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentSearch {
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
    String cmd = "Select * from Department where deptno = ?";
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setInt(1,deptno);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        System.out.println("Dept No.             : " + rs.getInt("deptno"));
        System.out.println("Dept Name       : " + rs.getString("dname"));
        System.out.println("Dept Location : " + rs.getString("loc"));
        System.out.println("Dept Head       : " + rs.getString("head"));
        System.out.println("------------------------------------------");
      } else {
        System.out.println("======= Record Not Found======");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
