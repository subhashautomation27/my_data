package com.hello;

public class Adat {
	Adat()
	{
		
	}
	
	Byte b=Byte.MAX_VALUE;
	Byte b1=Byte.MIN_VALUE;
	
	short s=Short.MAX_VALUE;
	short s1=Short.MIN_VALUE;
	
	
	int i=Integer.MAX_VALUE;
	int i1=Integer.MIN_VALUE;
	
	long l=Long.MAX_VALUE;
	long l1=Long.MIN_VALUE;
	
	double d=Double.MAX_VALUE;
	double d1=Double.MIN_NORMAL;
	double d2=Double.MIN_VALUE;
	
	float f=Float.MAX_VALUE;
	float f1=Float.MIN_NORMAL;
	float f2=Float.MIN_VALUE;
public static void main(String[] args) {
		 Adat obj=new Adat();
		 System.out.println("Byte range");
		 System.out.println(obj.b);
		 System.out.println(obj.b1);
		 System.out.println("its short range");
		 System.out.println(obj.s);
		 System.out.println(obj.s1);
		 System.out.println("its int range");
		 System.out.println(obj.i);
		 System.out.println(obj.i1);
		 System.out.println("its long range");
		 System.out.println(obj.l);
		 System.out.println(obj.l1);
		 System.out.println("its float range");
		 System.out.println(obj.f);
		 System.out.println(obj.f1);
		 System.out.println(obj.f2);
		 System.out.println("its double range");
		 System.out.println(obj.d);
		 System.out.println(obj.d1);
		 System.out.println(obj.d2);
		 
	}
}
