package com.hcl.generics;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ> {
  /*
   * compareTo() method for Employ Class.
   * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
   */

  @Override
  public int compare(Employ o1, Employ o2) {
    return o1.name.compareTo(o2.name);
  }
}
