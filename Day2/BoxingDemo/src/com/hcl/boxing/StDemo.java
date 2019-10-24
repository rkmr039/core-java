package com.hcl.boxing;
														

public class StDemo {
	public void show(){
		
		StDemo.diplay();
		System.out.println("INSTANCE METHOD");
	}
	static void diplay(){
		System.out.println("STATIC METHOD");
	}
	
	public static void main(String[] args) {
		 // display();
		StDemo.diplay();
		new StDemo().show();
	}

}
