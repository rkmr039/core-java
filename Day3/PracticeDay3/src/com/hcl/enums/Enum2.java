package com.hcl.enums;

enum Days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	
}

public class Enum2 {

	Days day;
	public Enum2(Days day){
		this.day = day;
	}
	public static void main(String[] args) {
		String day = "WEDNESDAY";
		Enum2 obj = new Enum2(Days.valueOf(day));
		
		System.out.println(obj.day);
		
	}
}
