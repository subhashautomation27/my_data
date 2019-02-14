package com.hello;
public class StaticDemo1 { 
	String name;
	int rollno;
	 static String collagename="sathyabama";
	public StaticDemo1(String name,int rollno){ 
		this.name=name;
		this.rollno=rollno;}
public void display()
{
	System.out.println(name +"  "+ rollno +"  "+ collagename );
}
public static void main(String[] args) {
	StaticDemo1 sd=new StaticDemo1("subhash", 100);
	StaticDemo1 sd1=new StaticDemo1("chandra", 200);
	sd.display();
	sd1.display();}}
