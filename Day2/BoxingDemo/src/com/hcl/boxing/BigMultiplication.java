package com.hcl.obj;

public class BigMultiplication {

	public StringBuilder multiply(String num1, String num2) {
		int l1 = num1.length();
		int l2 = num2.length();
		int[] res = new int[l1 + l2];
		
		for(int i=l1-1; i >=0; i--) {
			for(int j=l2-1; j >=0; j--) {
				int mul = (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
				int sum = res[i+j+1] + mul;
				res[i+j] += sum/10;
				res[i+j+1] = sum%10;
			}
		}		
		StringBuilder sb = new StringBuilder();
		for(int val: res) {
			if(sb.length() != 0 || val != 0 ) {
				sb.append(val);
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		String a = "2345666";
		String b = "3456766";
		System.out.println(new BigMultiplication().multiply(a, b));

	}

}
