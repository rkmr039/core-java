package com.hcl.obj;

import java.util.Scanner;

public class NumToWord {

	public StringBuilder convertIntoWords(int num) {
		StringBuilder word = new StringBuilder();
		String[] numArray = { " ", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
				"ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN",
				"TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINTY" };
		int digits = 0;
		if (num == 0) {
			word = word.append("ZERO");
			return word;
		} else { // Find Number of Digit
			do {
				digits++;
				num = num/10;
			}while(num > 0);
		}
		do {
			int n;
			if (digits == 4) {
				n = num / 1000;
				num = num - (n * 1000);
				word = word.append(numArray[n]);
				word = word.append(" THOUSAND ");
			} else if (digits == 3) {
				n = num / 100;
				num = num - (n * 100);
				if (n != 0) {
					word = word.append(numArray[n]);
					word = word.append(" HUNDREAD ");
				}
			} else if (digits == 2) {

				if (num < 20 && num > 9) {
					word = word.append(numArray[num]);
				} else {
					n = num / 10;
					if (n != 0) {
						word = word.append(numArray[n + 18]);
					}
				}
			} else {
				n = num % 10;
				if (n != 0) {
					word = word.append(numArray[n]);
				}
			}
			digits--;
		} while (digits >= 1);
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
