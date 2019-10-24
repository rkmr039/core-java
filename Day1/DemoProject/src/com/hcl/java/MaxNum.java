package com.hcl.java;

public class MaxNum {

	public void getGreatest(int a, int b, int c) {
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		System.out.println("Max Value " + m);
	}
	public static void main(String[] args) {
		int a = 8, b = 9, c = 5;
		new MaxNum().getGreatest(a, b, c);
	}
}