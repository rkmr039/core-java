package com.hcl.abstractClass;

abstract class Training{
	abstract void name();
	abstract void email();
}

class Rishab extends Training{

	@Override
	void name() {
		System.out.println("Rishab...");
		
	}

	@Override
	void email() {
		System.out.println("rkmr039@gmail.com");
	}
	
}
class Saikrishna extends Training {

	@Override
	void name() {
		System.out.println("Saikrishna");
	}

	@Override
	void email() {
		System.out.println("sai@gmail.com");
	}
	
}
public class AbsDemo{

	public static void main(String[] args) {
		// Training obj = new Rishab();
		// Training obj2 = new Saikrishna();
		
		Training[] arr =new Training[]{
				new Rishab(),
				new Saikrishna()
		};
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}

}
