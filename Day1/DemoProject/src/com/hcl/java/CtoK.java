package com.hcl.java;

public class CtoK {
  /**
   * convert Celsius to kelvin.
   * @param c .
   */

  public void calc(double c) {
    double k;
    k = 273.15 + c;
    System.out.println("Calvin value : " + k);
  }
  
  /**
   * main .
   * @param args .
   */

  public static void main(String[] args) {
    double c = 37;
    CtoK obj = new CtoK();
    obj.calc(c);
  }
}