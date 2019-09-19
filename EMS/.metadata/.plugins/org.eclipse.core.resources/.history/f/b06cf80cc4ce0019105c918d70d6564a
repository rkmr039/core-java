package com.hcl.ems;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestEms {

	@Test
	public void getEmployLeavesTest() {
		List<Leaves> leaves = EmsBal.getEmployLeavesBal(1000);
	String result = "";
	System.out.println(leaves.size());
		for (Leaves leave : leaves) {
			result += " " + leave.getEmpId();
			Employ e = EmsBal.getAccountInfoBal(leave.getEmpId());
			System.out.println(e.getEmpName());
			
			result += " " + e.getEmpLeaveBalance();
			result += " " + leave.getLeaId();
			result += " " + leave.getStartDate();
			result += " " + leave.getEndDate();
			result += " " + leave.getType();
			result += " " + leave.getStatus();
			result += " " + leave.getReason();
            result += " " + leave.getNoDays();
            System.out.println(result);
		}
	}
	
	/*@Test
	public void getMyLeavesTest(){
		List<Leaves> leaves = EmsBal.getMyLeavesBal2(1000);
		
		for (Leaves leave : leaves) {
			String result = "";
			result += " " + leave.getEmpId();
			Employ e = EmsBal.getAccountInfoBal(leave.getEmpId());
		
			
			result += " " + e.getEmpLeaveBalance();
			result += " " + leave.getLeaId();
			result += " " + leave.getStartDate();
			result += " " + leave.getEndDate();
			result += " " + leave.getType();
			result += " " + leave.getStatus();
			result += " " + leave.getReason();
            result += " " + leave.getNoDays();
            System.out.println(result);
		}
	}*/
/*	@Test // working fine
	public void getMyLeaveDaoTest() {
		Leaves l = EmsBal.getMyLeavesBal2(1000).get(1);
		System.out.println(l.getReason());
	}*/
	
/*	@Test // working fine
	public void getMyLeavesDaoTest() {
		Leaves l = EmsBal.getMyLeavesBal(2000).get(0);
		System.out.println(l.getEmpId());
	}*/
	
	

}
