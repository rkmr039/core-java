package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) { 
    List lstName = new ArrayList();
    lstName.add("RISHAB");
    lstName.add("YAHS");
    lstName.add("Anand");
    lstName.add("Amit");
    System.out.println("Name are : ");
    /*for (Object object : lstName) {
    System.out.println(object);
    }*/
    System.out.println("JDK 1.8");
    lstName.forEach(System.out::println);
    lstName.forEach(System.err::println);
    /* Edit */
    lstName.set(1, "Yash");
    lstName.forEach(System.out::println);
    // Removal  
    System.out.println("list after removing by index...");
    lstName.remove(3);
    lstName.forEach(System.out::println);
    System.out.println("list after removing by object...");
    lstName.remove("Anand");
    lstName.forEach(System.out::println);
  }
}
