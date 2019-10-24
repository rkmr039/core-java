package com.hcl.studentsproject;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class StudentMain {

  static ResourceBundle rb = ResourceBundle.getBundle("project");
  /**
   * delete student method().
   */

  public static void deleteStudent() {
    int sno;
    Scanner sc = new Scanner(System.in);
    System.out.println(rb.getString("entersno"));
    sno = sc.nextInt();
    StudentBal obj = new StudentBal();
    String res = obj.deleteStudentBal(sno);
    System.out.println(res);
  }

  /**
   * update student method().
   */
 
  public static void updateStudent() {
    Student objStudent = new Student();
    Scanner sc = new Scanner(System.in);
    System.out.println(rb.getString("entersno"));
    objStudent.setSno(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("entername"));
    objStudent.setName(sc.nextLine());
    System.out.println(rb.getString("entercity"));
    objStudent.setCity(sc.nextLine());
    System.out.println(rb.getString("entercgp"));
    objStudent.setCgp(Double.parseDouble(sc.nextLine()));
    StudentBal obj = new StudentBal();
    String res = obj.updateStudentBal(objStudent);
    System.out.println(res);
  }

  /**
   * show list of students available .
   */
  
  public static void showStudent() {
    StudentBal obj = new StudentBal();
    List<Student> lstStudent = obj.showStudentBal();
    for (Student student : lstStudent) {
      System.out.println(student);
    }
  }

  /**
   * search student on the basis of sno.
   */
  
  public static void searchStudent() {
    int sno;
    System.out.println(rb.getString("entersno"));
    Scanner sc = new Scanner(System.in);
    sno = sc.nextInt();
    StudentBal obj = new StudentBal();
    Student objStudent = obj.searchStudentBal(sno);
    if (objStudent != null) {
      System.out.println(objStudent);
    } else {
      System.out.println(rb.getString("notfound"));
    }
  }

  /**
   * method for inserting student into list.
   */
  
  public static void addStudent() {
    
    Student objStudent = new Student();
    Scanner sc = new Scanner(System.in);
    System.out.println(rb.getString("entersno"));
    objStudent.setSno(Integer.parseInt(sc.nextLine())); // NumberFormateException
    System.out.println(rb.getString("entername"));
    objStudent.setName(sc.nextLine());
    System.out.println(rb.getString("entercity"));
    objStudent.setCity(sc.nextLine());
    System.out.println(rb.getString("entercgp"));
    objStudent.setCgp(Double.parseDouble(sc.nextLine()));
    StudentBal obj = new StudentBal();
    try {
      boolean res = obj.addStudentBal(objStudent);
      if (res == true) {
        System.out.println(rb.getString("added"));
      }
    } catch (StudentExceptions e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * main().
   * @param args .
   */
  
  public static void main(String[] args) {
    int ch;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println(rb.getString("opt"));
      System.out.println(rb.getString("dashes"));
      System.out.println(rb.getString("opt1"));
      System.out.println(rb.getString("opt2"));
      System.out.println(rb.getString("opt3"));
      System.out.println(rb.getString("opt4"));
      System.out.println(rb.getString("opt5"));
      System.out.println(rb.getString("opt6"));
      System.out.println(rb.getString("enterchoice"));
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          addStudent();
          break;
        case 2:
          showStudent();
          break;
        case 3:
          searchStudent();
          break;
        case 4:
          updateStudent();
          break;
        case 5:
          deleteStudent();
          break;
        case 6:
          return;
        default:
          System.out.println(rb.getString("opt7"));
      }
    } while (ch != 6);
  }
}