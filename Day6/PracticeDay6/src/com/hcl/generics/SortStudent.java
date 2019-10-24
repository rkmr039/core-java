package com.hcl.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
  /**
   * main().
   * @param args . 
   */

  public static void main(String[] args) {
	Comparator<Student> c = new CgpComparator();
	c = new CityComparator();
	Set lstStudent = new TreeSet<Student>(c);
	lstStudent.add(new Student(1, "Rishab", "Delhi", 6.3));
	lstStudent.add(new Student(2, "Amit", "Noida", 7.3));
	lstStudent.add(new Student(3, "Amar", "Kanpur", 8.3));
	lstStudent.add(new Student(4, "Anand", "Patna", 9.3));
	lstStudent.add(new Student(5, "Tushar", "Mumbai", 5.3));
	System.out.println("Student List : ");
	lstStudent.forEach(System.out::println);
  }
}
