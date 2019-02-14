package com.string.lite;
public class C {
	public static void main(String[] args) {
		String s="subhash";
		String s1="subhash";
		String s2=new String("subhash");
		String s3=new String("subbi");
		String s4="india";
		String s5=new String("INDIA");
		System.out.println(s.equals(s1));//true
		System.out.println(s.equals(s2));//true 
		System.out.println(s2.equals(s3));//false bcoz both objects are not eqauls.
		System.out.println(s4.equals(s5));//false bcoz both are not equal.its case sensitive.
		System.out.println(s4.equalsIgnoreCase(s5)); }}//true .its ignore false case.
		
