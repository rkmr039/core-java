package com.hcl.library;

public class Book {

	private int id;
	/*@Override
	public String toString() {
		return "<br/>Book <br/>[id=" + id + ",<br/> name=" + name + ",<br/> author=" + author + ",<br/> dept=" + dept + ",<br/> edition=" + edition
				+ ",<br/> nos=" + nos + "]<br/><br/>===============";
	}*/
	private String name;
	private String author;
	private String dept;
	private String edition;
	private int nos; 
	
	public int getNos() {
		return nos;
	}
	public void setNos(int nos) {
		this.nos = nos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	
}