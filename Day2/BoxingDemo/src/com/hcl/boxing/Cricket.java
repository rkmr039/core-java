package com.hcl.boxing;

public class Cricket {

	static int score;
	public void incr(int x){
		score+=x;
	}
	public static void main(String[] args) {
		
		Cricket b1 = new Cricket();
		Cricket b2 = new Cricket();
		Cricket b3 = new Cricket();
		
		b1.incr(20);
		b2.incr(30);
		b3.incr(50);
		
		
		System.out.println(Cricket.score);
	}
}
