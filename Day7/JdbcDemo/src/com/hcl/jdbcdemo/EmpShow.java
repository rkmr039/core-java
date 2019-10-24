package com.hcl.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
  /**
   * main() .
   * @param args .
   *
   */

  public static void main(String[] args) {
    Connection con = GetDbConnection.getConnection("sqlpractice");
    try {
      Statement st = con.createStatement();
      String cmd = "SELECT * FROM dept";
      ResultSet rs = st.executeQuery(cmd);
      while (rs.next()) {
        System.out.print(" | " + rs.getInt("deptno"));
        System.out.print(" | " + rs.getString("dname"));
        System.out.print(" | " + rs.getString("loc"));
        
        System.out.println("\n");
      }
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
  }
}
