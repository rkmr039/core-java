package com.hcl.access_specifier;

public class OtherClass {

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		//System.out.println(obj.a); // protected is not accessible 
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
