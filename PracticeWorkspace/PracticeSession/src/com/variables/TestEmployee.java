package com.variables;

public class TestEmployee {

	public static void main(String[] args) {
	Employee subhash=new Employee();
	Employee bose=new Employee();
	System.out.println(subhash.salary);
	System.out.println(bose.salary);
	
	subhash.salary=20000;
	
	System.out.println(subhash.salary);
	System.out.println(bose.salary);
	
// in emp.class instant varibale  value changed effected only that object(subhash.salary)
// in emp.class static vari value changed na that is effected remaininf object also (bose.salary)
	}

}
