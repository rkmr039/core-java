package com.hcl.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptShow {
  /**
   * main() .
   * @param args .
   *
   */

  public static void main(String[] args) {
    Connection con = GetDbConnection.getConnection("sqlpractice");
    try {
      Statement st = con.createStatement();
      String cmd = "SELECT * FROM Emp";
      ResultSet rs = st.executeQuery(cmd);
      while (rs.next()) {
        System.out.print(rs.getInt("empno"));
        System.out.print(" | " + rs.getString("ename"));
        System.out.print(" | " + rs.getString("job"));
        System.out.print(" | " + rs.getString("mgr"));
        System.out.print(" | " + rs.getDate("hiredate"));
        System.out.print(" | " + rs.getInt("sal"));
        System.out.print(" | " + rs.getInt("comm"));
        System.out.print(" | " + rs.getInt("deptno"));
        System.out.println("\n");
      }
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
  }
}