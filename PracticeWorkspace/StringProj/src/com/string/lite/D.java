package com.string.lite;
public class D {
	public static void main(String[] args) {
	  String s="subhash";
	  String s1=new String("tirumala");
	  String s2="bose";
	  String s3=new String("domain");
	  String s4=new String("subhash");
	  System.out.println(s.compareTo(s1));// s>s1 -->-1
      System.out.println(s1.compareTo(s));//s1>s--> 1
      System.out.println(s2.compareTo(s3));//s2>s3-->-2
      System.out.println(s3.compareTo(s1));//s3>s4-->-16
      System.out.println(s.compareTo(s4));	//s>s4-->0
     String s6="   subhashchandrabose    ";
     System.out.println(s6.substring(0,6));
     System.out.println(s6.trim());
     
     
	}}
     
	

