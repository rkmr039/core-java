package com.hcl.interfacePckg;

interface IFirst{
	default void name(){
		System.out.println("IFirst");
	}
}
interface ISecond{
	default void name(){
		System.out.println("ISecond");
	}
}
interface IThird{
	default void name(){
		System.out.println("IThird");
	}
}

class Demo implements IFirst, ISecond, IThird{

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();	
	}
}
public class MultiInh2 {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.name();
	}
}
