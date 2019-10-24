package com.hcl.customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerDao {
  static List<Customer> lstCustomer = null;
  static ResourceBundle rb = ResourceBundle.getBundle("project");
  
  static {
    lstCustomer = new ArrayList<Customer>(0);
  }
  
  // INSERT
  public String addCustomerDao(Customer customer) {
    lstCustomer.add(customer);
    return rb.getString("added");
  }
  
  /**
   * search a Customer from list.
   * @param sno .
   * @return Customer if found.
   */
  
  public Customer searchCustomerDao(int sno) {
    Customer obj = null;
    for (Customer customer : lstCustomer) {
      if (customer.getCustId() == sno) {
        obj = customer;   
      }
    }
    return obj;
  }
  
  // SELECT *
  public List<Customer> showCustomerDao() {
    return lstCustomer;
  }
  
  /**
   * UPDATE operation for Customer class.
   * @param obj Customer to be deleted
   * @return resultant string.
   */
  public String updateCustomerDao(Customer obj) {
    Customer customer = searchCustomerDao(obj.getCustId());
    if (customer != null) {
      for (Customer s : lstCustomer) {
        if (s.getCustId() == obj.getCustId()) {
          s.setCustName(obj.getCustName());
          s.setAnnualIncom(obj.getAnnualIncom());
          s.setModalPremium(obj.getModalPremium());
          s.setPaymentMode(obj.getPaymentMode());
        }
      }
      return rb.getString("update");
    } else {
      return rb.getString("notfound");
    }
  }
  
  /**
   * this method is used for storing customer list into file. 
   */

  public static void storeCustomer() {
    try {
      FileOutputStream fos = new FileOutputStream("C:/files/customers.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(lstCustomer);
      oos.close();
      fos.close();
    } catch (FileNotFoundException e1) {
      e1.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * this method is used for display customer list from file. 
   */

  public List<Customer> displayCustomer() {
    try {
      FileInputStream fin = new FileInputStream("C:/files/customers.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      lstCustomer = (List<Customer>) objin.readObject();
      return lstCustomer;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  /**
   * delete Customer method .
   * @param sno .
   * @return success or not found .
   */
  
  public String deleteCustomerDao(int sno) {
    Customer customer = searchCustomerDao(sno);
    if (customer != null) {
      lstCustomer.remove(sno);
      return rb.getString("delete");
    } else {
      return rb.getString("notfound");
    }  
  }
}
