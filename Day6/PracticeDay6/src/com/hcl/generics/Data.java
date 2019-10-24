package com.hcl.generics;

public class Data<T> {
  /**
   * swap two numbers.
   * @param x .
   * @param y .
   */

  public void swap(T x, T y) {
    T t;
    System.out.println(" X : " + x + " y : " + y);
    t = x;
    x = y;
    y = t;
    System.out.println(" X : " + x + " y : " + y);
  }
}
