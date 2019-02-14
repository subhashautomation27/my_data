package MethodReturnType;
public class Employee1 {
	double salary;
	double bounus;
	double hra;
	double otherav;
	double pf;
	double medal;
public void calculattotal(double salary, double bounus, double hra, double otherav, double pf, double medal) {
		double total = salary + bounus + hra + otherav + pf + medal;
		System.out.println(total); }}
