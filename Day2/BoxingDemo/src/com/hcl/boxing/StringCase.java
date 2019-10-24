<<<<<<< HEAD
package com.hcl.boxing;

class Demo{
	static { // static will be executed first on time of creation of object 
		System.out.println("DEMO class");
	}
}
public class StringCase {

	boolean climate;
	
	
	public void check(int x){
		//if(x=2){ // error
		if(x==2){
			System.out.println("CORRECT");
		}else{
			System.out.println("WRONG");
		}
	}
	public void show(Object obj){
		if(obj == "ABC"){ // String dosn't need  Unboxing
			System.out.println("CORRECT");
		}else{
			System.out.println("WRONG");
		}
	}
	public static void main(String[] args) {
		String str = "ABC";
		//Demo obj1 = new Demo();
		System.out.println(str);
		
		StringCase obj = new StringCase();
		obj.show(str);
		obj.check(2);
		System.out.println(obj.climate);
		obj = null;
		obj.check(20);
	}
	static{
		System.out.println("STATIC INSIDE PUBLIC CLASS");
	}
}
=======
package com.hcl.boxing;

public class StringCase {

	public void show(Object obj){
		if(obj == "ABC"){ // String dosn't need  Unboxing
			System.out.println("CORRECT");
		}else{
			System.out.println("WRONG");
		}
	}
	public static void main(String[] args) {
		String str = "ABC";
		StringCase obj = new StringCase();
		obj.show(str);
	}
}
>>>>>>> branch 'master' of https://github.com/rkmr039/Java_Practice.git
