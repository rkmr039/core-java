package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStreamDemo {
  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) { 
    try { 
      FileInputStream fin = new FileInputStream("C:/files/object.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      
      String str = (String) objin.readObject();
      Date d = (Date) objin.readObject();
      System.out.println(str);
      System.out.println(d);
      
      objin.close();
      fin.close();
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    } catch (ClassNotFoundException e) { 
      e.printStackTrace();
    }
  }
}
