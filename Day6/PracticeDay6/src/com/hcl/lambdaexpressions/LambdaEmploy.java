package com.hcl.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import com.hcl.generics.Employ;
import java.util.List;


public class LambdaEmploy {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    List<Employ> lstEmploy = new ArrayList<Employ>();
    lstEmploy.add(new Employ(1, "Rishab", 21343));
    lstEmploy.add(new Employ(2, "Yash", 25343));
    lstEmploy.add(new Employ(3, "Anand", 92674));
    lstEmploy.add(new Employ(4, "Amit", 62454));
    lstEmploy.add(new Employ(5, "Tushar", 34434));
    
    System.out.println("Sorting by Name...");
    Collections.sort(lstEmploy, (e1,e2) -> {
      return e1.name.compareTo(e2.name);
    });
    for (Employ employ : lstEmploy) {
      System.out.println(employ);
    }
    System.out.println("Sorting by Basic Salery...");
    /*
    Collections.sort(lstEmploy, (e1,e2) -> {
      return (int) (e1.basic - e2.basic);
    });
    for (Employ employ : lstEmploy) {
      System.out.println(employ);
    }*/
    lstEmploy.stream().filter(p -> p.basic >= 25000).forEach(x -> {
      System.out.println(x);
    });
    
  }
}
