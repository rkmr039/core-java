package com.hcl.lambdaexpressions;

//Object Specific implementation of one method in interface
@FunctionalInterface
public interface ICalc {
  int calc(int a, int b);
}