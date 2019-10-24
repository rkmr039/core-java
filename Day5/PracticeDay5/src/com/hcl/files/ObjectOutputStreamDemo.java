package com.hcl.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamDemo {
  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) { 
    try { 
      FileOutputStream fout = new FileOutputStream("C:/files/object.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      objout.writeObject(new String("Date is  : "));
      objout.writeObject(new Date());
      objout.close();
      fout.close();
      System.out.println(".....Object Stored....");
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }
}
