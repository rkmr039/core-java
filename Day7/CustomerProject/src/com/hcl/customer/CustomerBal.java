package com.hcl.customer;

import java.util.List;
import java.util.ResourceBundle;

public class CustomerBal {
  static StringBuilder sb = new StringBuilder();
  static ResourceBundle rb = ResourceBundle.getBundle("project");
  /**
   * method for adding Customer into list.
   * @param obj .
   * @return isAddded . 
   * @throws CustomerExceptions .
   */

  public boolean addCustomerBal(Customer obj) throws CustomerExceptions {
    boolean isAdded = true;
    if (obj.getCustId() <= 0) {
      sb.append(rb.getString("custId"));
      isAdded = false;
    }
    if (obj.getCustName().length() <= 5) {
      sb.append(rb.getString("custName"));
      isAdded = false;
    }
    if (obj.getModalPremium() <= 1000 || obj.getModalPremium() >= 50000) {
      sb.append(rb.getString("modelPayment"));
      isAdded = false;
    }
    
    if (obj.getPaymentMode() != 1 && obj.getPaymentMode() != 2 && obj.getPaymentMode() != 3) {
      sb.append(rb.getString("paymentMode"));
      isAdded = false;
    }
    
    if (obj.getAnnualIncom() <= 20000 || obj.getAnnualIncom() >= 1000000) {
      sb.append(rb.getString("custAnnIncome"));
      isAdded = false;
    }
  
    if (isAdded == false) {
      throw new CustomerExceptions(sb.toString());
    } else {
      new CustomerDao().addCustomerDao(obj);
    }
    return isAdded; 
  }
  
  public Customer searchCustomerBal(int sno) {
    return new CustomerDao().searchCustomerDao(sno); 
  }
  
  public List<Customer> showCustomerBal() {
    return new CustomerDao().showCustomerDao();
  }
  
  public String updateCustomerBal(Customer obj) {
    return new CustomerDao().updateCustomerDao(obj);
  }
  
  public String deleteCustomerBal(int sno) {
    return new CustomerDao().deleteCustomerDao(sno); 
  }
  
  public static void storeCustomer() {
    new CustomerDao().storeCustomer();  
  }

  public List<Customer> displayCustomer() {
    return new CustomerDao().displayCustomer();  
  }  
}
