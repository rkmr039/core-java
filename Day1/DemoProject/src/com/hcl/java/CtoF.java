package com.hcl.java;


public class CtoF {

  /**
   * calc for converting celsius to farenheit.
   * @param c .
   */

  public void calc(double c) {
    double f;
    f = ((9 * c) / 5) + 32;
    System.out.println("Fahenheit value : " + f);
  }
  
  /**
   * main().
   * @param args .
   */
   
  public static void main(String[] args) {
    double c = 37;
    CtoF obj = new CtoF();
    obj.calc(c);
  }

}