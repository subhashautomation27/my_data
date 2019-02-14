package com.map;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTest {
public static void main(String[] args) {
          ArrayList al=new ArrayList();
          for (int i = 0; i <10; i++)
          {
			al.add(al);
		  }
          System.out.println(al);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
          Iterator I=al.iterator();
        		 while(I.hasNext())
        		 {
        	     Integer a=(Integer) I.next();
        	              if(a%2 == 0)
        	            	  System.out.println(al);
        	              else
        	            	  I.remove();
        	          } System.out.println(al);
        		   }}
