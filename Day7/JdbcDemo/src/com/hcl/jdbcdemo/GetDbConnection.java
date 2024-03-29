package com.hcl.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetDbConnection {
  /**
   * method will return connection or null.
   * @return con as DB connection. 
   */

  public static Connection getConnection(String dbName) {
    Connection con = null;
    String connectionString = String.format("jdbc:mysql://localhost:3306/%s", dbName);
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(connectionString,"root","root");
      System.out.println("Connected");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    
    return con;
  }
}
