package com.hcl.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("C:/files/employ.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      Employ e1 = new Employ(1, "Rishab", 12345);
      Employ e4 = new Employ(2, "Anand", 8712345);
      Employ e3 = new Employ(3, "Yash", 167542345);
      Employ e2 = new Employ(4, "Raja", 12345245);
      objout.writeObject(e1);
      objout.writeObject(e2);
      objout.writeObject(e3);
      objout.writeObject(e4);
      objout.close();
      fout.close();
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
