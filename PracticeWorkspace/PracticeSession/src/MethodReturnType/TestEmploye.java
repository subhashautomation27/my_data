package MethodReturnType;
public class TestEmploye {
public static void main(String[] args) {
		Employee subhash=new Employee();
		subhash.salary=60000;
		subhash.bonus=9000;
		subhash.calculatesalary();
		
		
		Employee bose=new Employee();
		bose.salary=49000;
		bose.bonus=6000;
		bose.calculatesalary();
		
		System.out.println(subhash.calculatesalary() +bose.calculatesalary());
		}}
