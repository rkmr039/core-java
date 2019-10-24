package com.hcl.generics;

import java.io.Serializable;
import java.util.Comparator;

public class Student {
  int sno;
  String name;
  String city;
  Double cgp;

  @Override
  public String toString() { 
    return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
  }
  /**
   * constructor() .
   * @param sno .
   * @param name .
   * @param city .
   * @param cgp .
   */
  
  public Student(int sno, String name, String city, double cgp) {
    this.sno = sno;
    this.name = name;
    this.city = city;
    this.cgp = cgp;
  }
  public static Comparator<Student> NameComparator = new Comparator<Student>() {
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}; 
  
}
