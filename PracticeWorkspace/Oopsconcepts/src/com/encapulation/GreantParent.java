package com.encapulation;
public class GreantParent {
	
	public int i=100;
	int j=200;
	private int k=300;
	protected int z=400;
	
	public void test1()
	{
		System.out.println(i);		
		System.out.println(j);
		System.out.println(k);
		System.out.println(z);
	}
	
	public void test()
	{
		System.out.println(i + j + k + z);
	}

	 public static void main(String[] args) {
		 GreantParent g=new GreantParent();
		 g.test();
		 g.test1();
		 System.out.println("total");
	}
}
