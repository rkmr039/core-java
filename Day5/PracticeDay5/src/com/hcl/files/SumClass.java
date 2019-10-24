package com.hcl.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumClass {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      System.out.println(a + b);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}