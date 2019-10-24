package com.hcl.boxing;

public class Employ {

	int empno;
	String name;
	double basic;

	@Override
	public boolean equals(Object obj) {

		Employ e = (Employ) obj;
		if (e.basic == this.basic) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

}
