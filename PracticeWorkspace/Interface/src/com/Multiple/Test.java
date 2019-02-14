package com.Multiple;
public class Test  implements CC{
     public CC Hello() {
		System.out.println("hello to all");
		return null;}
     public CC Hi() {
		System.out.println("hi everybudy ");
		return null;}
	public CC Welcome() {
			System.out.println("welcome to the our world");
		return null;}
	public static void main(String[] args) {
		Test obj=new Test();
		AA a=new Test();
		BB b=new Test();
		CC c=new Test();
		//one way
		obj.Hello().Hi().Welcome();
		//second way
		a.Hello();
		b.Hi();
		c.Welcome(); 
		//third way
		obj.Hello();
		obj.Hi();
		obj.Welcome();
		
	}

}
