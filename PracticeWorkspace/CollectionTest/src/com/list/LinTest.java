package com.list;
import java.util.LinkedList;
public class LinTest {
public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("subhash");
		ll.add("true");
		ll.add(null);
		ll.add(34);
		System.out.println(ll);
		ll.add("tirumala");
		ll.add("tirumala");
		
		
		LinkedList l2=new LinkedList();
		l2.add("chandra");
		l2.add(234);
		l2.add(456);
		l2.addAll(ll);
		System.out.println(l2);}}
