package com.variables;
public class LocalVariableDemo {
public void test()
	{
		int i=100;
		System.out.println(i);
	}
public void test1()
{
	//System.out.println(i);// can't use i value from out side of the method .
						   //bcoz its local variable.
	}
public static void main(String[] args) {
		
LocalVariableDemo lv=new LocalVariableDemo();
// lv.i;// can't use.
}}
