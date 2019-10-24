package com.hcl.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("C:/files/student.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      Student obj = new Student(1, "RISHAB", "DELHI", 8.6);
      objout.writeObject(obj);
      objout.close();
      fout.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
