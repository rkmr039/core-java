package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add("RISHAB");
    s.add("YASH");
    s.add("Lakshmi");
    s.add("Tushar");
    System.out.println("Sorted Data");
    s.forEach(System.out::println);;
  }
}
