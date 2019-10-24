package com.hcl.inheritance;
 // base class object will be created first
class First{
	static {
		System.out.println("BASE STATIC");
	}
	public First(){ // if a constructor in base class then u must have the same constructor(parameters) in derived class
		System.out.println("BASE CLASS CONSTRUCTOR...");
	}
}
public class Second extends First {

	static {
		System.out.println("DERIVED STATIC");
	}
	public Second(){ // constructor of derived class will always call the constructor of base class
		System.out.println("DERIVED CLASS CONSTRUCTOR...");
	}
	public static void main(String[] args) {
		new Second();
	}
}
