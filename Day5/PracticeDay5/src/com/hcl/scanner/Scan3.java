package com.hcl.scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("C:/files/data.txt");
      fw.write("12 r t 45 45.56 true rishu");
      fw.close();
      FileReader fr = new FileReader("C:/files/data.txt");
      Scanner sc = new Scanner(fr);
      while (sc.hasNext()) {
        if (sc.hasNextInt()) {
          System.out.println(sc.nextInt());
        } else {
          sc.next();
        }
      }
      sc.close();
      fr.close();
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
