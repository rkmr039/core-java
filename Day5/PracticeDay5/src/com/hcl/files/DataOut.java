package com.hcl.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) { 
    try { 
      // data will be stored in JVM understandable format
      DataOutputStream dout = new DataOutputStream(new FileOutputStream("C:/files/data.txt"));
      dout.writeInt(12);
      dout.writeUTF("HCL");
      dout.writeDouble(1221321.343);
      dout.writeBoolean(true);
      dout.close();
      System.out.println("*** File Created ***");
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  } 
}
