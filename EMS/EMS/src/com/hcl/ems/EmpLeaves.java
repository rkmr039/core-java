package com.hcl.ems;

import java.util.List;

public class EmpLeaves {
	public String getEmployeesLeaves(int mgrId) {
		List<Leaves> leaves = EmsBal.getEmployLeavesBal(mgrId);
		String result = "";
		for (Leaves leave : leaves) {
			result += " " + leave.getEmpId();
			Employ e = EmsBal.getAccountInfoBal(leave.getEmpId());
			System.out.println(e.getEmpName());
			result += " " + e.getEmpName();
			result += " " + e.getEmpLeaveBalance();
			result += " " + leave.getLeaId();
			result += " " + leave.getStartDate();
			result += " " + leave.getEndDate();
			result += " " + leave.getType();
			result += " " + leave.getStatus();
			result += " " + leave.getReason();
            result += " " + leave.getNoDays();
		}
		return result;
	}
	
}
