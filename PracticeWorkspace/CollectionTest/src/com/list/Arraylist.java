package com.list;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Vector;
public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		 al.add(10);
		 al.add("subhashchandrabose");
		 al.add("A");
		 al.add("A");
		 al.add(null);
		 al.add(200);
		 System.out.println(al);//-->[10, subhashchandrabose, A, A, null, 200]
		
		 al.add(800);
		 System.out.println(al);//[10, subhashchandrabose, A, A, null, 200, 800]
		 
		 al.add("bose");
		 al.add(2);
		 System.out.println(al);//[10, subhashchandrabose, A, A, null, 200, 800, bose, 2]
		
		 al.remove(2);
		 System.out.println(al);
	      
		  al.add("tirumala");
		  al.add("ass");
		  al.add(300);
		  System.out.println(al);
		  
		  
		  ArrayList list=new ArrayList(8);
		  list.add("subhash");
		  list.add("tirumala");
		  list.add("bose");
		  list.add(null);
		  list.add(23);
		  list.add(45);
		  list.add(45);
		  list.add(null);
		  list.add("a");
		  System.out.println(list);
		  
		  ArrayList ls=new ArrayList();
		  Vector v=new Vector();
		  LinkedList ll=new LinkedList();
		  System.out.println(ls instanceof Serializable);//true
		  System.out.println(v instanceof Serializable);//true
		  System.out.println(ll instanceof Serializable);//true
		  System.out.println(ls instanceof RandomAccess);//true
		  System.out.println(ll instanceof RandomAccess);//false
		  System.out.println(v instanceof Cloneable);//true
		  System.out.println(ls instanceof Cloneable);//true
		  System.out.println(ll instanceof Cloneable);//true
		  System.out.println(v instanceof RandomAccess);//true
		  System.out.println(ll instanceof Cloneable);//true
		  
		  ArrayList al1=new ArrayList();
		  List l=Collections.synchronizedList(al1);
		  
		// public static List synchronizedList(List l)
		   LinkedList l3=new LinkedList<>();
		  List l1=Collections.synchronizedList(l3);
		  HashSet hs=new HashSet();
		  Set s=Collections.synchronizedSet(hs);
		  
	}}//[10,subhashchandrabose, A, null, 200, 800, bose, 2]

		
