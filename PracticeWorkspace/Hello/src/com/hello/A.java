package com.hello;

class S {
	public void test()
	{
		System.out.println("paraent method");
	}
}

public class A extends S {
	
	public void test()
	{
		//super.test();
	      System.out.println("child method");
	}
	
	public void show ()
	{
		super.test();
	}
	
	
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
	}

}

