
package com.hcl.boxing;

public class Demo1 {

	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,  int y){
		return x+y;
	}
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		int res = obj.sum();
		System.out.println("Sum is "+res);
		res = obj.sum(5);
		System.out.println("Sum is "+res);
		res = obj.sum(5,7);
		System.out.println("Sum is "+res);
	}
}
