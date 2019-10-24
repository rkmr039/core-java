package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {
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
      String cmd = "SELECT * FROM emp WHERE empno =?";
      PreparedStatement ps = con.prepareStatement(cmd);
      ps.setInt(1,  empno);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        System.out.println("Employ Name       : " + rs.getString("ename"));
        System.out.println("Employ Job        : " + rs.getString("job"));
        System.out.println("Manager No        : " + rs.getInt("mgr"));
        System.out.println("Hiredate          : " + rs.getDate("hiredate"));
        System.out.println("Salary            : " + rs.getInt("sal"));
        System.out.println("Comm              : " + rs.getInt("comm"));
        System.out.println("Department No     : " + rs.getInt("deptno"));
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
