package com.hcl.scanner;

import java.util.Scanner;

public class SumDemo {
  /**
   * main() .
   * @param args .
   */
  public static void main(String[] args) {
    System.out.print("Enter Two Number : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum : " + (a + b));
  }
}
