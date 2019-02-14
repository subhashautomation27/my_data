package com.hello;

public class MethodOver {
	
	public void A()
	{
		System.out.println("hello");
	}
	public void A(int i)
	{   this.A();
		System.out.println(i);
	}
	public void A(int i,int j)
	{    this.A(10);
		System.out.println(i + j);
	}
	public void A (int i,int j,int k)
	{     this.A(10, 20);
		System.out.println(i+j+k);
	}
	
	public static void main(String[] args) {
		MethodOver mm=new MethodOver();
		mm.A(10, 20, 30);
	}
}
