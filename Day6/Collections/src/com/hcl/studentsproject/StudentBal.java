package com.hcl.studentsproject;

import java.util.List;

public class StudentBal {
  static StringBuilder sb = new StringBuilder();
  /**
   * method for adding student into list.
   * @param obj .
   * @return isAddded . 
   * @throws StudentExceptions .
   */

  public boolean addStudentBal(Student obj) throws StudentExceptions {
    boolean isAdded = true;
    if (obj.getSno() <= 0) {
      sb.append("Student SNo can not be negative or zero....\r\n");
      isAdded = false;
    }
    if (obj.getName().length() <= 3) {
      sb.append("Name more then 3 characters...\r\n");
      isAdded = false;
    }
    if (obj.getCity().length() <= 3) {
      sb.append("City more then 3 characters...\r\n");
      isAdded = false;
    }
    if (obj.getCgp() < 0) {
      sb.append("CGP Non-Negative....\r\n");
      isAdded = false;
    }
    if (isAdded == false) {
      throw new StudentExceptions(sb.toString());
    } else {
      new StudentDao().addStudentDao(obj);
    }
    return isAdded; 
  }
  
  public Student searchStudentBal(int sno) {
    return new StudentDao().searchStudentDao(sno); 
  }
  
  public List<Student> showStudentBal() {
    return new StudentDao().showStudentDao();
  }
  
  public String updateStudentBal(Student obj) {
    return new StudentDao().updateStudentDao(obj);
  }
  
  public String deleteStudentBal(int sno) {
    return new StudentDao().deleteStudentDao(sno); 
  }
  
  
}