package com.hcl.files;

import java.io.Serializable;

public class Employ implements Serializable { 
  int empno;
  String name;
  transient double basic;
  /**
   * constructor().
   * @param empno .
   * @param name .
   * @param basic .
   */

  public Employ(int empno, String name, double basic) { 
    this.empno = empno;
    this.name = name;
    this.basic = basic; // to hide the data (minor security)
  }
  /**
   * toString() .
   */

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}
