package com.hcl.inventry;


public class InventryBal {
  
	public static String generateStockIdBal() {
		return new InventryDao().generateStockIdDao();
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
}
