package com.hcl.jdbcstudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DaoConnection {

  /**
   * method will return db connection object if connected. 
   * @return connection if connected successfully else it's value will be null. 
   */

  public static Connection getConnection() {
    ResourceBundle rb = ResourceBundle.getBundle("db");
    String url = rb.getString("mysqlurl");
    String user = rb.getString("user");
    String password = rb.getString("password");
    Connection con = null;
    try {
      Class.forName(rb.getString("mysqldriver"));
      con = DriverManager.getConnection(url);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;
  
  }
}