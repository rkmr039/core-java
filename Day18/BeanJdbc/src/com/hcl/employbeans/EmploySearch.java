package com.hcl.employbeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmploySearch {
  
  private int empno;

public int getEmpno() {
	return empno;
}

public void setEmpno(int empno) {
	this.empno = empno;
}
  public ResultSet searchEmploy() {
	  Connection con = DaoConnection.getConnection();
	  ResultSet rs = null;
	  String cmd = "select * from employ where empno =?";
	  try {
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empno);
		rs = pst.executeQuery();	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return rs;
  }
}
