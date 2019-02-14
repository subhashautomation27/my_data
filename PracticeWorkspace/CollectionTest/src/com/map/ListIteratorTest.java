package com.map;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorTest {

	public static void main(String[] args) {
      LinkedList ll=new LinkedList();
      ll.add("subhash");
      ll.add("chandra");
      ll.add("bose");
      ll.add("tirumala");
      System.out.println(ll);//[subhash, chandra, bose, tirumala]
      
      ListIterator ltr=ll.listIterator();
      while (ltr.hasNext())
      {
    	  String s=(String)ltr.next();
    	  if(s.equals("tirumala"))
    	  {
    		  ltr.remove();//here removing -->[subhash, bangi, bose, sarru]
    	  }
    	  else if(s.equals("bose"))
    	  {
    		  ltr.add("sarru");//here adding object -->[subhash, bangi, bose, sarru, tirumala]
    	  }
    	  else if(s.equals("chandra"))
    	  {
    		  ltr.set("bangi");// here replace or set object-->[subhash, bangi, bose, tirumala]
    	  }
    	  System.out.println(ll);
      }
}}
 