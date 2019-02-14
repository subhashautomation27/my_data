package com.list;
import java.util.Vector;
public class VectorTest {
public static void main(String[] args) {
         Vector v=new Vector();
         v.addElement("subhash");
         v.addElement(12);
         v.addElement("tirumala");
         v.addElement(null);
         v.addElement(12);
         System.out.println( v.capacity());//10
         System.out.println(v.size());//5
         System.out.println(v);//[subhash, 12, tirumala, null, 12]
         v.removeElementAt(1);
         System.out.println(v);//[subhash, tirumala, null, 12]
         for (int i = 1; i < 10; i++) {
        	 v.addElement(i);}//[subhash, tirumala, null,12, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(v.capacity());}}//20
