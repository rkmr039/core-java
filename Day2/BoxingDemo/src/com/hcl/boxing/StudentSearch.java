<<<<<<< HEAD
package com.hcl.boxing;

public class StudentSearch {

	public Student searchStudent(int sno){
		Student obj = null;
		if(sno == 1){
			obj = new Student();
			obj.sno = 10017826;
			obj.name = "RISHAB";
			obj.city = "Delhi";
			obj.cgp = 7.5;
		}
		if(sno==2){
			obj = new Student();
			obj.sno = 1003455;
			obj.name = "YASH";
			obj.city = "BANGALORE";
			obj.cgp = 7.5;
		}
		return obj;
	}
	public static void main(String[] args) {
		StudentSearch obj = new StudentSearch();
		Student student = obj.searchStudent(1);
		
		if(student != null){
			System.out.println(student);
		}else{
			System.out.println("Student Not Found...");
		}
		
		
	}
}
=======
package com.hcl.boxing;

public class StudentSearch {

	public Student searchStudent(int sno){
		Student obj = null;
		if(sno == 1){
			obj = new Student();
			obj.sno = 10017826;
			obj.name = "RISHAB";
			obj.city = "Delhi";
			obj.cgp = 7.5;
		}
		if(sno==2){
			obj = new Student();
			obj.sno = 1003455;
			obj.name = "YASH";
			obj.city = "BANGALORE";
			obj.cgp = 7.5;
		}
		return obj;
	}
	public static void main(String[] args) {
		StudentSearch obj = new StudentSearch();
		Student student = obj.searchStudent(1);
		
		if(student != null){
			System.out.println(student);
		}else{
			System.out.println("Student Not Found...");
		}
		
		
	}
}
>>>>>>> branch 'master' of https://github.com/rkmr039/Java_Practice.git
