package com.map;
import java.util.Enumeration;
import java.util.Vector;
public class EnumurationTest {
public static void main(String[] args) {
       Vector v=new Vector();
        for (int i = 10; i <=100; i=i+ 10) 
        {
			v.addElement(i);
		}
        
        System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        Enumeration e=v.elements();
        while (e.hasMoreElements())
        {
        	Integer I=(Integer)e.nextElement();
        	if(I%2==0)
        	{
        		System.out.println(I);//0,2,4,6,8
        	}}
        System.out.println(v);}}//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
