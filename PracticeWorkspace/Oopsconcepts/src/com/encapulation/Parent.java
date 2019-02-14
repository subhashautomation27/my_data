package com.encapulation;

public class Parent extends GreantParent {
	
	 
		  public void hello ()
		  {
		   System.out.println(i);
		   System.out.println(j);
		   System.out.println(z);
		   
		   //its private member 
		   //System.out.println(k);
		   
		   test1();
		 }
		  
		  public static void main(String[] args) {
			  
			  Parent p=new Parent();
			  p.test();
			  p.test1();
			System.out.println("success");
		}
}




