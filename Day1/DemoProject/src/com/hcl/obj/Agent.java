package com.hcl.obj;

public class Agent {

	public StringBuilder show(String agentId,
								String fullName,
								int maritalStatus,
								String zipcode){
		StringBuilder sbResult = new StringBuilder();
		
		boolean isValid = true;
		
		if(!((agentId.charAt(0)) == 'A'))
		{
			sbResult.append("Agent ID Starts with 'A' " + "\r\n" ); 
			isValid = false;
		}
		fullName = fullName.trim();
		if(fullName.indexOf(" ") == -1){
			sbResult.append("Fullname should contain First and Last name" + "\r\n" ); 
			isValid = false;
		}
		if(fullName.length() > 20){
			sbResult.append("Full name length should be less then 20 characters"+ "\r\n" ); 
			isValid = false;
		}
		if(!(zipcode.length() == 6) ){
			sbResult.append("Zipcode length should be 6 characters "+ "\r\n" ); 
			isValid = false;
		}
		if(maritalStatus != 0 && maritalStatus !=1){
			sbResult.append("Please Provide Maritial Status as \r\nMarried:1\r\nNot Married:0"+ "\r\n" ); 
			isValid = false;
		}
		if(isValid){
			sbResult.append("Agent ID " +agentId+ "\r\n" );
			sbResult.append("Name "+ fullName+ "\r\n" );
			sbResult.append("Maritial Status "+maritalStatus);
			sbResult.append("Zipcode "+zipcode);
		}
		
		return sbResult;
		
		
	}

	public static void main(String[] args) {

		int married = 1;
		String agentId = "B01";
		String zipcode = "293847";
		String fullName = " RISHAB KUMAR";

		System.out.println(new Agent().show(agentId, fullName, married, zipcode));

	}
}
