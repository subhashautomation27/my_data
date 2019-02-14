package com.maviba.oopsconcepts;
import com.encapulation.*;

public class A  extends GreantParent 
{
    public void test ()
    {
    	GreantParent gp=new GreantParent();
    	System.out.println(gp.i);
    	//System.out.println(gp.j);
    	//System.out.println(gp.k);
    	//System.out.println(gp.z);
    	   
    }
    
   public static void main(String[] args) {
	  A a1=new A();
	  System.out.println(a1.z);
}


}
