package com.hcl.enums;

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Enum1 {

	public static void main(String[] args) {
		Day s = Day.SUNDAY;
		Day m = Day.valueOf("MONDAY");
		Day[] t = Day.values();
		for( Day z: t ){
			System.out.println(z);
		}
		System.out.println(s);
		System.out.println(m);
	}
}
