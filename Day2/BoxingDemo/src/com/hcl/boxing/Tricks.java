package com.hcl.boxing;

public class Tricks {

	public static void main(String[] args) {
		int i=1;
		int j=0;
		j = i++ + 1; // post increment operator will change the value for next line 
		System.out.println(j);
		System.out.println(i);
		System.out.println();
		
		i=4;
		j=0;
		j = ++i + 1; // pre increment operator will change the value for same line 
		System.out.println(j);
		System.out.println(i);
		System.out.println();
		
	}
}
