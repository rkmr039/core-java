<<<<<<< HEAD
package com.hcl.boxing;


/**
 * @author Coalesce
 * Method Overloading Demo 
 * Compile Time(or static) polymorphism
 */
public class OverLoadDemo {

	public void show(int x){
		System.out.println("Show w.r.t. Int ..."+x);
	}
	public void show(String x){
		System.out.println("Show w.r.t. String ..."+x);
	}
	public void show(boolean x){
		System.out.println("Show w.r.t. boolean..."+x);
	}
	public void show(double x){
		System.out.println("Show w.r.t. Double ..."+x);
	}
	public static void main(String[] args) {
		OverLoadDemo obj = new OverLoadDemo();
		obj.show(true);
		obj.show(12);
		obj.show("1234567890");
		obj.show(12.5);
		
	}
}
=======
package com.hcl.boxing;


/**
 * @author Coalesce
 * Method Overloading Demo 
 * Compile Time(or static) polymorphism
 */
public class OverLoadDemo {

	public void show(int x){
		System.out.println("Show w.r.t. Int ..."+x);
	}
	public void show(String x){
		System.out.println("Show w.r.t. String ..."+x);
	}
	public void show(boolean x){
		System.out.println("Show w.r.t. boolean..."+x);
	}
	public void show(double x){
		System.out.println("Show w.r.t. Double ..."+x);
	}
	public static void main(String[] args) {
		OverLoadDemo obj = new OverLoadDemo();
		obj.show(true);
		obj.show(12);
		obj.show("1234567890");
		obj.show(12.5);
		
	}
}
>>>>>>> branch 'master' of https://github.com/rkmr039/Java_Practice.git
