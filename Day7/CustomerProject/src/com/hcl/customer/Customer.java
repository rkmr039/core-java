package com.hcl.customer;

import java.io.Serializable;

public class Customer implements Serializable {

  private int custId;
  private String custName;
  private double annualIncom;
  private double modalPremium;
  private int paymentMode;
  
  public int getCustId() {
    return custId;
  }
  
  public void setCustId(int custId) {
    this.custId = custId;
  }
  
  public String getCustName() {
    return custName;
  }
  
  public void setCustName(String custName) {
    this.custName = custName;
  }
  
  public double getAnnualIncom() {
    return annualIncom;
  }
  
  public void setAnnualIncom(double annualIncom) {
    this.annualIncom = annualIncom;
  }
  
  public double getModalPremium() {
    return modalPremium;
  }
  
  public void setModalPremium(double modalPremium) {
    this.modalPremium = modalPremium;
  }
  
  public int getPaymentMode() {
    return paymentMode;
  }
  
  public void setPaymentMode(int paymentMode) {
    this.paymentMode = paymentMode;
  }
  
  public Customer() {
  }
  
  /**
   * Parameterized constructor.
   * @param custId Unique ID of Customer. 
   * @param custName Name of Customer.
   * @param annualIncom Annual Income of Customer.
   * @param modalPremium Modal Premium pay by Customer.
   * @param paymentMode Payment Mode 1 or 2 or 3.
   */
  
  public Customer(int custId, String custName, double annualIncom,
      double modalPremium, int paymentMode) {
    this.custId = custId;
    this.custName = custName;
    this.annualIncom = annualIncom;
    this.modalPremium = modalPremium;
    this.paymentMode = paymentMode;
  }
  
  /**
   * toString() method for Customer object.
   */
  
  @Override
  public String toString() {
    return "Customer [custId=" + custId + ", custName=" + custName + ", annualIncom=" + annualIncom
          + ", modalPremium=" + modalPremium + ", paymentMode=" + paymentMode + "]";
  }
}