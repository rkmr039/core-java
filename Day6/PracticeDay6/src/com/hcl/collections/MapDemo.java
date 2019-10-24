package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  /**
   * main.
   * @param args .
   */

  public static void main(String[] args) {
    Map m = new HashMap();
    // key : username
    // value : password
    m.put("Rishab", "shagdt");
    m.put("Yash", "ufkhlt");
    m.put("Anand", "sh@#at");
    m.put("Amit", "gcjlkj");
    
    String key = "Yash";
    String value = (String)m.getOrDefault(key, "Not Found");
    System.out.println(value);
  }
}