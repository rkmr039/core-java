package com.hcl.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom { 
  /**
  * main().
  * @param args .
  */

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name");
    try { 
      String name = br.readLine();
      System.out.println("Name : " + name);
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }
}