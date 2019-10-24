package com.hcl.generics;

import java.io.Serializable;

public class Employ { 
  public int empno;
  public String name;
  public double basic;
  /**
   * constructor().
   * @param empno .
   * @param name .
   * @param basic .
   */

  public Employ(int empno, String name, double basic) { 
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  /**
   * toString() .
   */

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}
