package com.hcl.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    List<Product> list = new ArrayList<Product>();
    
    // Adding Products
    list.add(new Product(1, "HCL LAPTOP", 45000));
    list.add(new Product(2, "DELL LAPTOP", 10004));
    list.add(new Product(3, "SOCY MUSIC PLAYER", 4500));
    list.add(new Product(4, "SAMSUNG MOBILE", 50000));
    
    // stream() method of Stream class that extends Collection class
    System.out.println("Sorting by price..."); 
    list.stream().filter(p -> p.price >= 10000).forEach(x -> {
      System.out.println(x);
    });
    System.out.println("Names start with S...");
    list.stream().filter(p -> p.name.startsWith("S")).forEach(x -> {
      System.out.println(x);
    });
    Product maxP = list.stream().max((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
    System.out.println("Max Price Record");
    System.out.println(maxP);
    Product minP = list.stream().min((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
    System.out.println("Min Price Record");
    System.out.println(minP);
    
    
  }
}
