package com.hcl.java;

public class Perfect {

	public void showPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println("Perfect Num...");
		} else {
			System.out.println("Not Perfect Num...");
		}
	}

	public static void main(String[] args) {
		int n = 28;
		new Perfect().showPerfect(n);
	}

}