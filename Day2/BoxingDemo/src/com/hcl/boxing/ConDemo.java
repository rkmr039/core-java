package com.hcl.boxing;

public class ConDemo {

	static int a; // get memory in heap area
	static { // runs before main
		System.out.println("STATIC Constructor....");
		a = 5;
		show(a);
	}
	// default constructor is invoked by Object class
	/*public ConDemo() { // removed 
		System.out.println("Default Constructor...");
	}*/
	
	public static void show(int a){
		System.out.println("Hello Before Main..."+a);
	
	}
	public ConDemo() {
		showC(5);
		// TODO Auto-generated constructor stub
	}
	public  void showC(int a){
		System.out.println("Hello Before Main..."+a);
	}

	public static void main(String[] args) {
	
		new ConDemo();// this will run default constructor
	}
	
}
