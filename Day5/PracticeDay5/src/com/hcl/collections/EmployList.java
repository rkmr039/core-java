package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployList { 
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) { 
    List<Employ> arr = new ArrayList();
    arr.add(new Employ(1, "RISHAB", 29213));
    arr.add(new Employ(2, "Amit", 29213));
    arr.add(new Employ(3, "Tushar", 29213));
    arr.add(new Employ(4, "Anand", 29213));
    System.out.println("List of Employees");
    arr.forEach(System.out::println);
  }
}