package com.hcl.ems;

import java.text.ParseException;
import java.util.List;

public class EmsBal {

	public static boolean loginBal(int ID, String passWord) {
		return new EmsDao().loginDao(ID, passWord);
	}
	
	public static Employ getAccountInfoBal(int ID) {
		return new EmsDao().getAccountInfoDao(ID);
	}
	
	
	
	public static String applyLeaveBal(Leaves leave) throws ParseException {
		return new EmsDao().applyLeaveDao(leave);
	}
	
	public static Leaves getMyLeavesBal(int empId){
		return new EmsDao().getMyLeavesDao(empId);
	}
	
	public static List<Leaves> getEmployLeavesBal(int id) {
		return new EmsDao().getEmployLeavesDao(id);
	}
	
	public static Leaves getLeaveByIdBal(int leaveId) {
		return new EmsDao().getLeaveByIdDao(leaveId);
	}
	
	public static boolean approveDenyLeaveBal(int leaveId, String comments,String action) {
		return new EmsDao().approveDenyLeaveDao(leaveId, comments, action);
	}
	
	public static List<Leaves> getMyLeavesBal2(int id) {
		return new EmsDao().getMyLeaves(id);
	}
}
