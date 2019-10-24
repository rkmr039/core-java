package com.hcl.interfacePckg;

interface ITraining{
	void name();
	void email();
	
}

class Rishab implements ITraining{

	@Override
	public void name() {
		System.out.println("Rishab");
	}

	@Override
	public void email() {
		System.out.println("rkmr039@gmail.com");
	}
	
	
}
class Anand implements ITraining{

	@Override
	public void name() {
		System.out.println("Anand");
	}

	@Override
	public void email() {
		System.out.println("anand@gmail.com");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[]{
				new Rishab(),
				new Anand()
		};
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
		}
	}
}
