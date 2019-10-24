package com.hcl.interfacePckg;

interface IOne{
	void name();
}
interface ITwo{
	void email();
}

class Test implements IOne, ITwo{

	@Override
	public void email() {
		System.out.println("hcl@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Company HCL");
	}
	
}
public class MultiInh {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.name();
		obj.email();
	}
}
