package com.hcl.deptbeans;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptInsert {
  private int deptno;
  private String dname;
  private String loc;
  private String head;
  
  public int getDeptno() {
	return deptno;
}

public void setDeptno(int deptno) {
	this.deptno = deptno;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

public String getHead() {
	return head;
}

public void setHead(String head) {
	this.head = head;
}

public String insertDept() {
    Connection con = DaoConnection.getConnection();
    String result = "Error";
    String cmd = "insert into department values(?,?,?,?);";
    try {
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, getDeptno());
		pst.setString(2, getDname());
		pst.setString(3, getLoc());
		pst.setString(4, getHead());
		pst.executeUpdate();
		result = "***INSERTED***";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		result = e.getMessage();
	}
    return result;
  }
}
