package com.hcl.files;

import java.io.Serializable;

public class Student implements Serializable {
  int sno;
  String name;
  String city;
  transient double cgp; // can lead to conflicts // be careful while using transient 

  @Override
  public String toString() { 
    return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
  }
  /**
   * constructor() .
   * @param sno .
   * @param name .
   * @param city .
   * @param cgp .
   */
  
  public Student(int sno, String name, String city, double cgp) {
    this.sno = sno;
    this.name = name;
    this.city = city;
    this.cgp = cgp;
  }
}