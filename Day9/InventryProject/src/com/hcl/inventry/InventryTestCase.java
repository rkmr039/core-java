package com.hcl.inventry;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;


public class InventryTestCase {


  @Test
  public void testDaoConnection() {
    assertNotNull(DaoConnection.getConnection());
  }
  
  @Test
  public void testSettersAndGetters() {
    Stock stock = new Stock();
    stock.setStockId("S003");
    stock.setItemName("Mobile");
    stock.setPrice(15500.00);
    stock.setQuantityAvail(20);
    
    assertEquals("S003", stock.getStockId());
    assertEquals("Mobile", stock.getItemName());
    assertEquals(20, stock.getQuantityAvail());
    assertEquals(15500.00, stock.getPrice(),0.00);
    
  }
  
  @Test
  public void testToString() {
    assertNotNull(new Stock().toString());
  }
  
  @Test
  public void testGenerateStockId() {
    String stockId = "";
    Connection con = DaoConnection.getConnection();
    //String cmd = "SELECT * FROM Stock ORDER BY stockid DESC LIMIT 1;";
    String cmd = "SELECT MAX(stockid) stockid FROM stock";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      stockId = rs.getString("stockid");
      stockId = stockId.substring(1);
      int tempId = Integer.parseInt(stockId);
      tempId += 1;
      stockId = String.format("S%03d", tempId);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    assertEquals(stockId, InventryBal.generateStockIdBal());  
  }
  
  @Test
  public void testGenerateOrdereId() {
    Connection con = DaoConnection.getConnection();
    PreparedStatement pst = null;
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
    assertEquals(orderid, InventryBal.generateOrderId());
  }

  @Test
  public void testAddStock() {
    Stock obj = new Stock();
    obj.setStockId(InventryBal.generateStockIdBal());
    obj.setItemName("Computer");
    obj.setPrice(55000.00);
    obj.setQuantityAvail(50);
    assertEquals("Stock Added", InventryBal.addStockBal(obj));
  }

  @Test
  public void testSearchStock() {
    assertNotNull(InventryBal.searchStockBal("S003"));
    assertNull(InventryBal.searchStockBal("S103"));
  }

  @Test
  public void testPlaceOrder() {
    assertEquals("Order Placed", InventryBal.placeOrderBal("S006", 1));
    assertEquals("Stock Not Available", InventryBal.placeOrderBal("S002", 5000));
    assertEquals("Stock ID Incorrect", InventryBal.placeOrderBal("S105", 5));
  }
}
