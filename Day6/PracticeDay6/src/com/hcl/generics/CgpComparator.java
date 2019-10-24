package com.hcl.generics;

import java.util.Comparator;

public class CgpComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.cgp.compareTo(o2.cgp);
	}
	

}
