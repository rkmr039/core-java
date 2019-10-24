package com.hcl.abstractClass;

abstract class Animal {

	abstract void name();

	abstract void type();
}

class Lion extends Animal {

	@Override
	void name() {
		System.out.println("Lion");
	}

	@Override
	void type() {
		System.out.println("Wild Animal");
	}

}

class Crocodile extends Animal {

	@Override
	void name() {
		System.out.println("Crocodile");
	}

	@Override
	void type() {
		System.out.println("Water Animqal");
	}

}

public class AbsTest {

	public static void main(String[] args) {
		Animal[] arr = new Animal[] { new Lion(), new Crocodile() };
		for (Animal animal : arr) {
			animal.name();
			animal.type();
			//System.out.println(animal);
		}
	}
}