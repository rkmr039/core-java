package com.hcl.boxing;

public class BoxTest {

	public void show(Object obj){
		//String type1 = obj.getClass().getName(); // class name with package
		String type2 = obj.getClass().getSimpleName(); // class name without package
		//System.out.println(type1);
		//System.out.println(type2);
		if(type2.equals("Integer")){
			int x = (Integer)obj;
			System.out.println("Integer Casting "+x);
		}
		if(type2.equals("Double")){
			double b = (Double)obj;
			System.out.println("Integer Casting "+b);
		}
		if(type2.equals("String")){
			String x = (String)obj;
			System.out.println("Integer Casting "+x);
		}
	}
	public static void main(String[] args) {
		int a =12;
		double b = 12.5;
		String name="HCL";
		
		BoxTest obj = new BoxTest();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}
}
