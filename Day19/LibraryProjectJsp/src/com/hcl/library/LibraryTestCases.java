package com.hcl.library;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LibraryTestCases {

	@Test
	public void bookGetterSetterTest (){
		Book obj = new Book();
		obj.setId(90);
		obj.setName("Test");
		obj.setAuthor("DenissRitchi");
		obj.setDept("Testing");
		obj.setEdition("5th");
		obj.setNos(20);
		
		assertEquals(90, obj.getId());
		assertEquals("Test", obj.getName());
		assertEquals("DenissRitchi", obj.getAuthor());
		assertEquals("Testing", obj.getDept());
		assertEquals("5th", obj.getEdition());
		assertEquals(20, obj.getNos());
		
	}

	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void loginTest() {
		String userName = "1";
		String pwd = "1";
		boolean res = LibraryBal.loginBal(userName,pwd);		
		assertTrue(res);
		
		pwd = "wrongpassword";
		res = LibraryBal.loginBal(userName,pwd);		
		assertFalse(res);	
	}
	
	@Test
	public void issueBookBalTest() {
		assertFalse(LibraryBal.issueBookBal("1",3));
		assertTrue(LibraryBal.issueBookBal("1",9));
		LibraryBal.returnBookBal("1", 9);
		
	}
	
	@Test
	public void returnBookTest() {
		Connection con = DaoConnection.getConnection();
		String username = "1 ";
		String cmd = "select BookId from tranbook where username = ";
		cmd += username; 
		PreparedStatement pst;
		int bookid = 0;
		
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			bookid = rs.getInt("BookId");
		} catch (SQLException e) {
		}
		assertEquals("<br/>**********Returned Successfully**********", LibraryBal.returnBookBal(username, bookid));
		LibraryBal.issueBookBal(username,bookid);
	}
	
	@Test
	public void showHistoryTest() {
		String result = LibraryBal.showHistoryBal("1");
		char[] resArr = result.toCharArray();
		int count = 0;
		int len = 0;
		for (char c : resArr) {
			if(c == '/') {
				len++;
			}
		}
		Connection con = DaoConnection.getConnection();
		String cmd = "select Count(*) from transreturn where username='1'";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			count = rs.getInt("Count(*)");
		} catch (SQLException e) {
		}
		assertEquals(len, count);
	}
	
	@Test
	public void showIssuedBookTest() {
		String username = "1";
		String cmd = "SELECT Count(*) FROM tranbook WHERE Username =  ";
		cmd += username;
		int count = 0;
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			count = rs.getInt("count(*)");
		} catch (SQLException e) {
		} 
		
		String[][] res = LibraryBal.showIssuedBooksBal(username);
		assertEquals(count,res.length);
	}

	@Test
	public void searchBookTest() {
		String criteria = "Author";
		String value = "Joe Burns";
		String cmd = "SELECT Count(*) FROM books ";
		List<Book> books = new ArrayList<Book>();
		Connection con = DaoConnection.getConnection();
		int count = 0;
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			if(!(criteria.equals("TotalBooks"))) {
				cmd += "where " + criteria + " = ? ";
				pst = con.prepareStatement(cmd);
				if(criteria.equals("Id")) {
					pst.setInt(1, Integer.parseInt(value));
				}  else {
					pst.setString(1, value);
				}
			}
			ResultSet rs = pst.executeQuery();
			rs.next();
			count = rs.getInt("Count(*)");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		books = LibraryBal.searchBookBal(criteria, value); 	
		assertEquals(books.size(),count);
	}
}
