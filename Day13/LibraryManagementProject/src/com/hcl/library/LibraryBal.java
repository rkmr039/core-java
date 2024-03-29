package com.hcl.library;

import java.util.List;

public class LibraryBal {

	public static String[] loginBal(User user) {
		return new LibraryDao().loginDao(user);
	}
	
	public static List<Book> searchBookBal(String criteria, String value) {
		return new LibraryDao().searchBooksDao(criteria,value);
		
	}
	
	public static boolean issueBookBal(String name,int Id) {
		return new LibraryDao().issueBookDao(name, Id);
	}
	
	public static String[][] showIssuedBooksBal(String username) {
		return new LibraryDao().showIssuedBooksDao(username);
	}
	
	public static String returnBookBal(String username,int id) {
		return new LibraryDao().returnBookDao(username,id);
	}
	
	public static String showHistoryBal(String username) {
		return new LibraryDao().showHistoryDao(username);
	}
}
