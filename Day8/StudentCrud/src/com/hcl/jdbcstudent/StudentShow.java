package com.hcl.jdbcstudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentShow {
  /**
   * main method .
   * @param args .
   */

  public static void main(String[] args) {
    Connection con = new DaoConnection().getConnection();
    String cmd = "Select * from Student";
    
    try {
      PreparedStatement ps = con.prepareStatement(cmd);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
    	  System.out.println("Student          : " + rs.getInt("sno"));
          System.out.println("Student Name     : " + rs.getString("name"));
          System.out.println("Sub1 Marks       : " + rs.getString("sub1"));
          System.out.println("Sub2 Marks       : " + rs.getString("sub2"));
          System.out.println("Sub3 Marks       : " + rs.getInt("sub3"));
          System.out.println("Total Marks      : " + rs.getInt("total"));
          System.out.println("Average Marks    : " + rs.getInt("aveg"));
          System.out.println("------------------------------------------");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
