package com.hcl.enums;

enum Student {
	ANISHA, RISHAB, YASH, ANAND
}

public class Enum3 {

	public static void show(){
	
		Student[] arrStudent = Student.values();
		System.out.println(arrStudent.length);
		for(Student name: arrStudent){
			System.out.println(name);

	}}
	public static void main(String[] args) {
	
		show();
		
	}
}
