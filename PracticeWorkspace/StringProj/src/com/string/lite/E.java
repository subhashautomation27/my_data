package com.string.lite;
public class E {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("subhash");
		s=s.append("chandrabose");
		s=s.reverse();//reverse string
		System.out.println(s.delete(0, 2));//deletefirst two index
		System.out.println(s.capacity());// o/p :23 
		System.out.println(s.insert(1, "hi"));// insert hi at 1 index.
		System.out.println(s);}}//o/p:subhashchandrabose

