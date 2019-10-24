package com.hcl.access_specifier;

public class BaseClass {
	private int a;
	protected int b;
	public int c;
	int d;

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
