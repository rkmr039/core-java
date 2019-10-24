package com.hcl.scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("C:/files/data.txt");
      Scanner sc = new Scanner(fin);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      fin.close();
      sc.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
