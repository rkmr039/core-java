package com.hcl.varargs;

public class Attendence {

	public static void display(Object...ob){
		for (Object object : ob) {
			System.out.println(object);
		}
	}
	public static void show(int day,String... name){ // varying arguments
		for(String s: name ){
			System.out.print(day + " "+s+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		show(1);
		show(1,"YASH");
		show(2,"ANAND"," RISHAB");
		show(5,"1","2","3","4","5");
		
		display();
		display("RAM",12,true,12.4);
	}
}