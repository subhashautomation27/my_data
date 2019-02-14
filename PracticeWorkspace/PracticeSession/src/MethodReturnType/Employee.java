package MethodReturnType;
public class Employee {
 double salary;
double bonus;
public double calculatesalary()
{
	double total=salary + bonus;
	System.out.println(total);
	return total;
}
}
