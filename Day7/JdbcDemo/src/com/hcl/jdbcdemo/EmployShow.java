package com.hcl.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {
  /**
   * main() .
   * @param args .
   *
   */

  public static void main(String[] args) {
    Connection con = GetDbConnection.getConnection("sqlpractice");
    try {
      Statement st = con.createStatement();
      String cmd = "SELECT * FROM Employ";
      ResultSet rs = st.executeQuery(cmd);
      while (rs.next()) {
        System.out.print(rs.getInt("empno"));
        System.out.print(" | " + rs.getString("name"));
        System.out.print(" | " + rs.getString("dept"));
        System.out.print(" | " + rs.getString("desig"));
        System.out.print(" | " + rs.getInt("basic"));
        System.out.println("\n");
      }
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
  }
}