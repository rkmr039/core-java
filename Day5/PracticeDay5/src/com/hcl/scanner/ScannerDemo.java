package com.hcl.scanner;

import java.util.Scanner;

public class ScannerDemo {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    System.out.print("Enter uy namne : ");
    Scanner sc = new Scanner(System.in);
    sc.close();
    String name = sc.nextLine();
    System.out.println("Name : " + name);
  }
}