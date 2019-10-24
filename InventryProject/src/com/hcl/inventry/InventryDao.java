package com.hcl.inventry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventryDao {

  Connection con;
  PreparedStatement pst;
  
  public int generateOrderId() {
	  con = DaoConnection.getConnection();
	  int orderid = 0;
	  String cmd = "SELECT CASE WHEN MAX(OrderId) IS NULL "
	            + " THEN 1 ELSE MAX(OrderId) + 1 END orderNo "
	            + " FROM Orders ";
	  
	  try {
	      pst = con.prepareStatement(cmd);
	      ResultSet rs = pst.executeQuery();
	      if (rs.next()) {
	        orderid = rs.getInt("orderNo"); 
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  return orderid;
  }
  public String generateStockIdDao() {
	  con = DaoConnection.getConnection();
	  String stockId = "";
	  try {
		  String cmd = "SELECT * FROM Stock ORDER BY stockid DESC LIMIT 1;";
          pst = con.prepareStatement(cmd);
          ResultSet rs = pst.executeQuery();
          if (rs.next()) {
        	  String str = rs.getString("stockid");
        	  str = str.substring(1);
        	  int tempId = Integer.parseInt(str);
        	  tempId += 1;
        	  stockId = String.format("S%03d", tempId);
          } else {
        	  stockId = "S001";
          }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  
	  return stockId;
	  
  }
	public String addStockDao(Stock stock) {
		  con = DaoConnection.getConnection();
		  String result = "";
		  String cmd = "INSERT INTO Stock values(?,?,?,?);";
		  try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, stock.getStockId());
			pst.setString(2, stock.getItemName());
			pst.setDouble(3, stock.getPrice());
			pst.setInt(4, stock.getquantityAvail());
			pst.executeUpdate();
			result = "Stock Added";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  return result;
  }
  
  public Stock searchStockDao(String stockId) {
	con = DaoConnection.getConnection();
	String cmd = "SELECT * FROM Stock WHERE stockid = ?;";
	Stock stock = null;
	try {
		pst = con.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			stock = new Stock();
			stock.setStockId(stockId);
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getDouble("Price"));
			stock.setquantityAvail(rs.getInt("QuantityAvail"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return stock;
  }
  
  public String placeOrderDao(String stockId, int qnty) {
	  con = DaoConnection.getConnection();
	  int orderID = generateOrderId();
	  String result = "";
	  
	  Stock stock = searchStockDao(stockId);
	  ResultSet rs;
	try {
		rs = pst.executeQuery();
		if (stock != null) {
			  int tempQnty = stock.getquantityAvail();
			  if (qnty <= tempQnty) {
				  double price = stock.getPrice();
				  double billAmt = qnty * price;
				  String cmd = "INSERT INTO Orders values(?,?,?,?);";
				  pst = con.prepareStatement(cmd);
	              pst.setInt(1, orderID);
	              pst.setString(2, stockId);
	              pst.setInt(3, qnty);
	              pst.setDouble(4, billAmt);
	              pst.executeUpdate();
	              result = "Order Placed";
	              // update Stock Records
				  cmd = "UPDATE Stock set QuantityAvail = ? WHERE stockId = ?";
				  pst = con.prepareStatement(cmd);
				  pst.setInt(1, (tempQnty - qnty));
				  pst.setString(2, stockId);
				  pst.executeUpdate();
				  // Update Gross Amount Records from amount table
				  cmd = "SELECT Gamt FROM amount";
				  pst = con.prepareStatement(cmd);
				  rs = pst.executeQuery();
				  if (rs.next()) {
					  double amount = rs.getInt("Gamt");
	    			  amount = amount + billAmt;
	    			  cmd = "UPDATE amount set Gamt = ?";
	    			  pst = con.prepareStatement(cmd);
	    			  pst.setDouble(1, amount);
	    			  pst.executeUpdate();  
				  }
			  } else {
				  result = "Stock Not Available";
			  }
		  } else {
			  result = "Stock ID Incorrect";
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result; 
  }
}
