package com.Constructors;
import com.hello.AccessModifiers1;
public class AccessModifiers2 extends AccessModifiers1 {
	public void aaa(){    
		// private scope: within the class .
		//System.out.println(i);
		
		//default scope: within the package
		//System.out.println(j);
		
		//protected scope: within package and it is sub class in other package.
		System.out.println(k);
		System.out.println(l);}
	public static void main(String[] args) {
		AccessModifiers2 asd=new AccessModifiers2();
		asd.aaa();}
	
	

}
