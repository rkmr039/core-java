package com.hcl.ems;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*class HolidayObject{
	int day;
	int month;
	HolidayObject(int day, int month){
		this.day = day;
		this.month = month;
	}
	
}*/
public class Holidays {

	public int getHolidays(Date startDate, Date endDate){
		int holidays = 0;
		
	/*	List<HolidayObject> holidaysList = new ArrayList<HolidayObject>();
		holidaysList.add(new HolidayObject(15, 8)); // 15th August
		holidaysList.add(new HolidayObject(26, 1)); // 26th January
		holidaysList.add(new HolidayObject(2, 10)); // 2nd October
		
		System.out.println(holidaysList.get(0).day);
		System.out.println(holidaysList.get(0).month);*/
		
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);

		Calendar end = Calendar.getInstance();
		end.setTime(endDate);
		
		while( !start.after(end)){
		    Date targetDay = start.getTime();
		    System.out.println(targetDay.getDay());
		    if(targetDay.getDay() == 0 || 
		       targetDay.getDay() == 6 ||
		       targetDay.getDate() == 15 && targetDay.getMonth()+1 == 8) {
		    	holidays++;
		    }
		    start.add(Calendar.DATE, 1);
		}
		
		return holidays;
		
		
	}
}
