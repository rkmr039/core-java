package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp  {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    
    SortedSet s = new TreeSet();
    s.add(new Emp(1, "RISHAB", 23346));
    s.add(new Emp(2, "ANAND", 20346));
    s.add(new Emp(3, "YASH", 23006));
    s.add(new Emp(4, "RAJA", 25346));
    s.add(new Emp(5, "Sujal", 23346));
    s.add(new Emp(6, "Prince", 23346));
    s.add(new Emp(7, "Raghu", 23346));
    System.out.println("Sorted Set");
    s.forEach(System.out::println);
  }
}
