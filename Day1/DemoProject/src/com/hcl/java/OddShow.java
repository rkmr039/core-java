package com.hcl.java;

public class OddShow {

	public void show(int n) {
		int i = 1;
		while (i < n) {
			i = i + 2;
			System.out.println("Odd " + i);
		}
	}

	public static void main(String[] args) {
		int n = 20;
		new OddShow().show(n);
	}

}
