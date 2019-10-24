package com.hcl.daterange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ShowDateRange {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate;
		try {
			startDate = sdf.parse("2019-08-12");
			Date endDate = sdf.parse("2019-08-16");
			System.out.println("Start Date " + startDate);
			System.out.println("End date " + endDate);
			int holidays = 0;
			
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
			System.out.println("Holidays : " + holidays);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
