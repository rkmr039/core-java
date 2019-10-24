package com.hcl.studentsproject;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
  static List<Student> lstStudent = null;
  
  static {
    lstStudent = new ArrayList<Student>(0);
  }
  
  // INSERT
  public String addStudentDao(Student student) {
    lstStudent.add(student);
    return "Student Created Successfully....";
  }
  
  /**
   * search a student from list.
   * @param sno .
   * @return student if found.
   */
  
  public Student searchStudentDao(int sno) {
    Student obj = null;
    for (Student student : lstStudent) {
      if (student.getSno() == sno) {
        obj = student;   
      }
    }
    return obj;
  }
  
  // SELECT *
  public List<Student> showStudentDao() {
    return lstStudent;
  }
  
  /**
   * UPDATE operation for Student class.
   * @param obj student to be deleted
   * @return resultant string.
   */
  public String updateStudentDao(Student obj) {
    Student student = searchStudentDao(obj.getSno());
    if (student != null) {
      for (Student s : lstStudent) {
        if (s.getSno() == obj.getSno()) {
          s.setName(obj.getName());
          s.setCity(obj.getCity());
          s.setCgp(obj.getCgp());
        }
      }
      return "Record Updated...";
    } else {
      return " Student Not Found....";
    }
  }
  
  /**
   * delete student method .
   * @param sno .
   * @return success or not found .
   */
  
  public String deleteStudentDao(int sno) {
    Student student = searchStudentDao(sno);
    if (student != null) {
      lstStudent.remove(sno);
      return "Student Deleted...";
    } else {
      return "Student Not Found....";
    }  
  }
}
