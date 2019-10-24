package com.hcl.lambdaexpressions;

public class LambdaDemo4 {
  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) {
    ICtoF cf = (c) -> {
      double f = ((9 * c) / 5) + 32;
      return f;
    };
    ICtoF kl = (c) -> {
      double k = c + 273.15;
      return k;
    };
    System.out.println(cf.calc(36));
    System.out.println(kl.calc(96.8));
  }
}