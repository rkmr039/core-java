package com.hcl.inheritance;

class Employ {
	int empno;
	String name;
	double basic;


	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

}

class Rishab extends Employ {

	public Rishab(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
class Yash extends Employ{

	public Yash(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class SuperCon {

	public static void main(String[] args) {
		Employ e1 = new Rishab(1, "RISHAB", 22334);
		Employ e2 = new Yash(2, "YASH", 873573);
		// System.out.println(e1);
		// System.out.println(e2);
		Employ[] arrEmploy = new Employ[]{e1,e2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
