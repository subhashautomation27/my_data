package com.InterfaceD;
public class TestOfIntret {
public static void main(String[] args) {
Bank b=new Sbi();
		//Sbi bb=new Sbi();
System.out.println("rate of intereted" + b.rateofinterest() + "%");
Bank b1=new Pnb();
System.out.println("ROI" + b1.rateofinterest() + "%");
	}}
