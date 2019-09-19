package com.hcl.inventory;

import java.util.List;

public class ShowStock {
	
	public String showStock() {
		String html = "<jsp:include page='menu.html'></jsp:include> <form method='get' acton='ShowStock.jsp'> <center> <table border='1'> "
				+ "	<tr> 	<th>Stock Id</th>	<th>Item Name</th>	<th>Price</th>	<th>Quantity Available</th></tr>   " ;				
		
			
		List<Stock> stocks = InventryBal.showStockBal();
		for (Stock stock : stocks) {
			String temp = "<td> " + stock.getStockId() + " </td>"
				+ "<td> " + stock.getItemName()+ "</td>"
				+ "<td> " + stock.getPrice() + " </td>"
				+ "<td> " + stock.getQuantityAvail() + "</td></tr>";
			if(stock.getQuantityAvail() <= 10) {
				html +="<tr bgcolor='red' id='blinkRow'>";
				html +=temp;
				html += "</tr>";
			} else {
				html +="<tr>";
				html +=temp;
				html += "</tr>";
			}
		}
		html +=  "</table></center></form>";
		
		return html;
	}
	
}