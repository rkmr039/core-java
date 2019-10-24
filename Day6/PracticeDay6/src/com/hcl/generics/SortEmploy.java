package com.hcl.generics;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
  /**
   * main .
   * @param args .
   */

  public static void main(String[] args) {
    Comparator<Employ> c = new NameComparator();
    Set<Employ> setEmploy = new TreeSet<Employ>(c);
    setEmploy.add(new Employ(1, "Rishab", 21343));
    setEmploy.add(new Employ(2, "Yash", 21343));
    setEmploy.add(new Employ(3, "Anand", 92674));
    setEmploy.add(new Employ(4, "Amit", 62454));
    setEmploy.add(new Employ(5, "Tushar", 343434));
    System.out.println("Employ list : ");
    setEmploy.forEach(System.out::println);
  }
}
