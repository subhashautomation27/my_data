package com.variables;
public class InstantVariableDemo {
	int i=100;// inside class & out side memory.
			public void test()
			{
				System.out.println("");
			}
public static void main(String[] args) {
	InstantVariableDemo id=new InstantVariableDemo();
        System.out.println(id.i);}}
