package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    List<Employ> lstEmploy = new ArrayList<Employ>();
    lstEmploy.add(new Employ(1, "Rishab", 21343));
    lstEmploy.add(new Employ(2, "Yash", 21343));
    lstEmploy.add(new Employ(3, "Anand", 92674));
    lstEmploy.add(new Employ(4, "Amit", 62454));
    lstEmploy.add(new Employ(5, "Tushar", 343434));
    System.out.println("Employ list : ");
    lstEmploy.forEach(System.out::println);
  }
}
