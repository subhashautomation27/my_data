package com.variables;
public class StaticVariableDemo {
	 static int i=1111;// static variable
	 static void test()//static  method
	 {
		 System.out.println(i);
	 }
        int j=222;//Instant variable
        public void test1()
        {
       int k=30;//local variable
        	System.out.println(k);        }
        public static void main(String[] args) {
		//System.out.println(i);//10
		StaticVariableDemo s=new StaticVariableDemo();
		StaticVariableDemo s1=new StaticVariableDemo();
		StaticVariableDemo s2=new StaticVariableDemo();
		System.out.println(s.j);//20
		System.out.println(s1.j);
		System.out.println(s2.j);
		
		s.j=200;
		System.out.println(s.j);
		
		System.out.println(s.i);//20
		System.out.println(s1.i);
		System.out.println(s2.i);
		
		s1.i=4444;
		System.out.println(s1.i);
		System.out.println(s.i);
		System.out.println(s2.i);
		//s.test1();//30
		//s.test();//10
		}}
