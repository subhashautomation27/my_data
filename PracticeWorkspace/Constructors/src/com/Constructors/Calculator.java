package com.Constructors;
public class Calculator {
	int i=20;
	int j=20;
	int k=30;
	
	Calculator() {
		 System.out.println("this id default constructor");	}
	
	Calculator(int i){ 
		System.out.println(i);
		System.out.println("this is one parameter constructor");}
	
	Calculator(int i,int j){
		System.out.println(i+j);
		System.out.println("this is two parameter constructor");}
	
	Calculator(int i,int j,int k){
		System.out.println(i+j+k);
		System.out.println("this is three parameter constructor");}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
		Calculator c1=new Calculator(10);
		Calculator c2=new Calculator(10,20);
		Calculator c3=new Calculator(10,20,30);}}
