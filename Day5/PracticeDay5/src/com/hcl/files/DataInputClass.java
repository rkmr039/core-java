package com.hcl.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputClass {
  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) { 
    try { 
      DataInputStream din = new DataInputStream(new FileInputStream("C:/files/data.txt"));
      System.out.println(15 + din.readInt());
      System.out.println(din.readUTF());
      System.out.println("Basic " + din.readDouble());
      System.out.println("Flag " + din.readBoolean());
      din.close();
    } catch (FileNotFoundException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
