package com.map;
import java.util.Enumeration;
import java.util.Hashtable;
public class HsahtableTest {

	public static void main(String[] args) {
        Hashtable t=new Hashtable();
        t.put(100, "hello");
        t.put(101, "welcome");
        t.put(102, "to");
        t.put(103, "java world");
        t.put(104, 100000);
        t.put(105, "kbjbgjbg");
        // Out put will be descending order.
        System.out.println(t);//{105=kbjbgjbg, 104=100000, 103=java world, 102=to, 101=welcome, 100=hello}
         System.out.println(t.keys()); 
         System.out.println(t.keySet());
         System.out.println(t.entrySet());
         System.out.println(t.remove(104));
         System.out.println(t);
         
         Enumeration e=t.elements();
         while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println("This is hashtable elements" +  t);}
         
       for (String string : args) {
    	   System.out.println(t);}}}
