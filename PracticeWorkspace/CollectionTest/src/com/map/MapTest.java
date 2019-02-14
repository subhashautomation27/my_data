package com.map;
import java.util.HashMap;
import java.util.Map;
public class MapTest {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, "subhash");
		m.put(null, null);// not accepting more than one null as key
		m.put(null, "hello");
		m.put(109, "subhash");
		m.put("name", "chandra");// duplicates not allowed 
		m.put("name", "chandra");
		System.out.println(m);//{null=hello, 101=subhash, name=chandra, 109=subhash}
		System.out.println(m.size());//4
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");  
	      System.out.println(hm);
	       
		}}
		