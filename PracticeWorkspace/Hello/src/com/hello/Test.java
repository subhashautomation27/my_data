package com.hello;

public abstract class Test {
	
	Test() {
		System.out.println(" This is the class a constructor");
	      }
	
	// this is static body
     static void add() {
		System.out.println("hello");}

   // final keyword can be use with in body
final void test1() {
int i = 100;
		System.out.println(i);
	}
// thiis is abstract method
abstract void test2();
}

class Testt extends Test
{
	void test2() {
		System.out.println("this is abstarct method");
	}
	
	public static void main(String[] args) {
		Testt obj=new Testt();
		obj.test1();
	}

}

