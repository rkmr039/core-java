package com.hcl.obj;

import java.util.Scanner;

public class NumToWord {
	public StringBuilder convertIntoWords(int num) {
		StringBuilder word = new StringBuilder();
		int divider = 10;
		int times;
		int[] arrNum;
		if (num < 10) {
			times = 1;
		} else if (num > 9 && num < 99) {
			times = 2;
		} else if (num > 99 && num < 999) {
			times = 3;
		} else {
			times = 4;
		}
		arrNum = new int[times];
		divider = divider * times;

		while (times > 0) {
			int n = 0;
			arrNum[times] = num % divider;
			times--;
		}
		for(int n: arrNum){
			System.out.println(n);
		}

		return word;

	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		System.out.println(new NumToWord().convertIntoWords(num));

	}
}