package com.hcl.obj;

public class Employ {
	
	int empno;
	String name;
	double basic;

	public Employ[] showEmploy(){
		Employ[] arrEmploy = new Employ[3];
		
		arrEmploy[0] = new Employ();
		arrEmploy[0].empno = 1;
		arrEmploy[0].name="PriyaDarshani";
		arrEmploy[0].basic=52345;
		
		arrEmploy[1] = new Employ();
		arrEmploy[1].empno = 2;
		arrEmploy[1].name="RISHABKUMAR";
		arrEmploy[1].basic=52000;
		
		arrEmploy[2] = new Employ();
		arrEmploy[2].empno = 3;
		arrEmploy[2].name="AnubhavAnand";
		arrEmploy[2].basic=62345;
		
		return arrEmploy;
	}
	public static void main(String[] args) {
		Employ[] result = new Employ().showEmploy();
		for(Employ e: result){
			System.out.println("Employe Numbere "+e.empno +"\r\n" + "Employe Name "+ e.name +"\r\n" + "Basic Salery " +e.basic+"\r\n" );
		}
	}
	
}