package com.hcl.inheritance;

class First {

	public void show(){
		System.out.println("Base Class Show() method");
	}
}
class Second extends First {

	public void show(){
		//super.show();
		System.out.println("Child Class Show() method");
	}
}
public class InhDemo{
	public static void main(String[] args) {
		Second s1 = new Second(); // base class object creation in this way is not suggested
		First f1 = new Second(); // up casting // new keyword is given high priority

		
		
		//f1.show();
		//s2.show();
		
		First f2 = new First();
		Second s2 = new Second();
		//s2.show();
		
		First f3 = (First)s2;
		// f3.show();
		
		First f4 = (Second)s2;
		// f4.show();
		
		Second s3 = (Second)f1;
		// s3.show();
		
		
		
		
	}
}
