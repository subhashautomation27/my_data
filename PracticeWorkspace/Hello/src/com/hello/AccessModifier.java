package com.hello;

public class AccessModifier extends AccessModifiers1 {
	
	 public void  test123()
	 {
		 //System.out.println(i);
		 System.out.println(j);
		 System.out.println(k);
		 System.out.println(l);
	 }
	 public static void main(String[] args) {
		 AccessModifier aa=new AccessModifier();
		 aa.test123();
	}

}
