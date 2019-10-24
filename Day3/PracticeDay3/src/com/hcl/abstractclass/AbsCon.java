package com.hcl.abstractClass;

abstract class Employ{
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
class Janani extends Employ{

	public Janani(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
class Raghhu extends Employ{

	public Raghhu(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class AbsCon {

	public static void main(String[] args) {
		Employ obj1 = new Janani(1, "Janani", 110678);
		Employ obj2 = new Raghhu(2, "RTaghu", 96263);
		
		Employ[] arr = new Employ[]{obj1, obj2};
			for (Employ employ : arr) {
				System.out.println(employ);
			}
	}
}
