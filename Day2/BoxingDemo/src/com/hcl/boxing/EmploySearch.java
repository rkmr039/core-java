package com.hcl.boxing;

public class EmploySearch {

	public Employ showEmploy(int empno){
		Employ emp=null;
		
		if(empno == 1){
			emp = new Employ();
			emp.empno=1;
			emp.name="Anand";
			emp.basic=84567;
		}
		if(empno == 2){
			emp = new Employ();
			emp.empno=2;
			emp.name="RISHAB";
			emp.basic=343746;
		}
		
		return emp;
		
	}
	public static void main(String[] args) {
	
		EmploySearch objSearch = new EmploySearch();
		Employ obj = objSearch.showEmploy(2);
		
		if(obj != null){
			System.out.println(obj);
		}else{
			System.out.println("Employ Not Found....");
		}
		
	}
}
