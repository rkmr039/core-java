package com.hcl.access_specifier;

public class ChildClass extends BaseClass{

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		//System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}