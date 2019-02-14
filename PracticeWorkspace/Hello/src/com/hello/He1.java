package com.hello;

public abstract class He1 {
	
	public void test()
	{
		System.out.println("Hello to all");
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
class C extends He1
{
	void test2() {
		System.out.println("this is abstarct method");
	}
	
	 
public static void main(String[] args) {
		C obj=new C();
		obj.test1();}}
