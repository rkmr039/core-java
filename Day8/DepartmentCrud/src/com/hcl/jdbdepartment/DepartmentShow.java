package com.hcl.jdbdepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentShow {
  /**
   * main method .
   * @param args .
   */

  public static void main(String[] args) {
    Connection con = new DaoConnection().getConnection();
    String cmd = "Select * from department";
    
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        System.out.println("Dept No.             : " + rs.getInt("deptno"));
        System.out.println("Dept Name       : " + rs.getString("dname"));
        System.out.println("Dept Location : " + rs.getString("loc"));
        System.out.println("Dept Head       : " + rs.getString("head"));
        System.out.println("------------------------------------------");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
