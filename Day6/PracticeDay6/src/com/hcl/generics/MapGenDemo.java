package com.hcl.generics;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) {
    Map<Integer, String> m  = new Hashtable<Integer, String>();
    m.put(1, "Rishab");
    m.put(2, "Yash");
    m.put(3, "Anand");
    m.put(4, "Amit");
    
    int key;
    String result;
    System.out.println("Enter Key : ");
    Scanner sc = new Scanner(System.in);
    key = sc.nextInt();
    result = m.getOrDefault(key, "Not Found");
    System.out.println(result);
  }
}