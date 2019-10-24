package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {
  /**
   * main().
   * @param args .
   */

  public static void main(String[] args) { 
    try { 
      FileInputStream fin = new FileInputStream("C:/files/employ.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      Employ emp1 = (Employ) objin.readObject();
      System.out.println(emp1);
      Employ emp2 = (Employ) objin.readObject();
      System.out.println(emp2);
      Employ emp3 = (Employ) objin.readObject();
      System.out.println(emp3);
      Employ emp4 = (Employ) objin.readObject();
      System.out.println(emp4);
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
