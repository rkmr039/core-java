package com.hcl.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {

  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) {
    List<Integer> lstdata = new ArrayList<Integer>();

    lstdata.add(new Integer(22));
    lstdata.add(new Integer(21));
    lstdata.add(new Integer(20));
    lstdata.add(new Integer(19));
    lstdata.add(new Integer(18));
    lstdata.add(new Integer(17));
    lstdata.add(new Integer(16));
    lstdata.stream().limit(3).forEach(p -> {
      System.out.println(p);
    });
    System.out.println("After Shipping 2 records...");
    lstdata.stream().skip(2).forEach(p -> {
      System.out.println(p);
    });
    System.out.println("Filter data....");
    lstdata.stream().filter(p -> p > 16).forEach(x -> {
      System.out.println(x);
    });
  }
}
