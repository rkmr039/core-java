package com.hcl.library;

import java.util.List;

public class SearchBooks {

	private String searchType;
	private String searchValue;
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
    public List<Book> searchBook() {
		return LibraryBal.searchBookBal(searchType, searchValue);
	}
}
