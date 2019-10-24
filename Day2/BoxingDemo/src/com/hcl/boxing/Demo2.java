package com.hcl.boxing;

// value data type have higher priority then reference data type
// data type of parameter have higher priority 
public class Demo2 {

	public void show(int x){
		System.out.println("Int is..."+x);
	}
	public void show(double x){
		System.out.println("double is..."+x);
	}
	public void show(Double x){
		System.out.println("Double is..."+x);
	}
	public void show(Object x){
		System.out.println("Object is..."+x);
	}
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.show(12); // it will print int
		obj.show(12.5); // it will print double 
	}
}
