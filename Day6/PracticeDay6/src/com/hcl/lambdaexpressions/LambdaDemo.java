package com.hcl.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(4524));
    lstData.add(new Integer(4564));
    lstData.add(new Integer(0524)); // 1's compliment of number
    lstData.add(new Integer(4664));
    lstData.forEach(p -> {
      System.out.println(p);
    });
  }
}
