package com.hcl.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
  /**
   * main() .
   * @param args .
   */

  public static void main(String[] args) {
    Date d = new Date();
    System.out.println(d);
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
    System.out.println(sdf.format(d));
    String strDate = "09/03/2019";
    try {
      Date obj = sdf.parse(strDate);
      System.out.println(sdf.format(obj));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
