package com.Set;
import java.util.Iterator;
import java.util.TreeSet;
public class TreesetTest {

	public static void main(String[] args) {
    /*TreeSet t=new TreeSet();
    t.add("subhash");
   
    //t.add(null);//java.lang.NullPointerException. doent accept null objects.
   // t.add(23);//  java.lang.ClassCastException .doesn't accept heterogeneous objects.
    t.add("d");
    t.add("D");
    System.out.println(t);//[D, d, subhash]. if string na alphabatic order
    */
		TreeSet t=new TreeSet();
		t.add(200);
		t.add(30);
		t.add(456);
		t.add(10);
		System.out.println(t);//[10, 30, 200, 456] .if integer na ascending order
		
		for (Object object : t) {
			System.out.println(object);
			}
		
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());//
		}}}
