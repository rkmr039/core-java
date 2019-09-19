package com.hcl.inventory;

import java.util.List;

public class InventryBal {
  
  public static boolean doLoginBal(String userName, String passWord) {
	  return new InventryDao().doLoginDao(userName, passWord);
  }
  
  
  public static List<Stock> showStockBal() {
	  return new InventryDao().showStockDao(); 
  }
  public static String generateStockIdBal() {
    return new InventryDao().generateStockIdDao();
  }

  public static int generateOrderId() {
    return new InventryDao().generateOrderId();
  }

  public static String addStockBal(Stock stock) {
    return new InventryDao().addStockDao(stock);
  }

  public static Stock searchStockBal(String stockid) {
    return new InventryDao().searchStockDao(stockid);
  }
  
  public static String placeOrderBal(String stockId, int qnty) {
    return new InventryDao().placeOrderDao(stockId,qnty);
  }
  
  public static String updateStockBal(String stockid,double price,int qnty) {
    return new InventryDao().updateStockDao(stockid, price, qnty);
  }
}
