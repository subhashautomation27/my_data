package com.hello;
class A3
{private int i=10;
	 int j=20;
	 protected int k=30;
	 public int l=40;
	 
	 public void test()    {
	 System.out.println(i);
	 System.out.println(j);
	 System.out.println(k);
	 System.out.println(l);    }}
	public class AccessModifiers1 extends A3 {
		public void test1(){
			//it is private. can't use out side of the class.
			// System.out.println(i);
			 System.out.println(j);
			 System.out.println(k);
			 System.out.println(l);}}


 


