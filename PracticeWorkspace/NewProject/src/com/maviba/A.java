package com.maviba;
public abstract class A {
	// this is constructor 
	A() {
		System.out.println(" This is the class a constructor");
	}
	
	// this is static body
static void add() {
		System.out.println("hello");
	}

   // final keyword can be use with in body
final void test() {
int i = 100;
		System.out.println(i);
	}
// thiis is abstract method
abstract void test1();
}

class B extends A
{

	void test1() {
		System.out.println("this is abstsrct methods");
		
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.test();
		b.test1();
	}
	
}


