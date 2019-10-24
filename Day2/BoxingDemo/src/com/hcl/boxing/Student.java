package com.hcl.boxing;

public class Student {

	int sno;
	String name;
	String city;
	double cgp;
	@Override
	public boolean equals(Object obj) {
		
		Student objStudent = (Student)obj;
		if (objStudent.city == this.city) {
			return true;
		} else {
			return false;
		}		
	}	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
}
