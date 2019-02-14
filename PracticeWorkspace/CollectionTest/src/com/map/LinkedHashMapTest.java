package com.map;
import java.util.LinkedHashMap;
public class LinkedHashMapTest {
public static void main(String[] args) {
		
		LinkedHashMap <Integer,String> lm=new LinkedHashMap <Integer,String>();
		lm.put(101, "subhash");
		lm.put(102, "chandra");
		lm.put(103, "bose");
		lm.put(104, "tirumala");
		System.out.println(lm.values());//[subhash, chandra, bose, tirumala]
		System.out.println(lm.keySet());//[101, 102, 103, 104]
		System.out.println(lm.entrySet());//[101=subhash, 102=chandra, 103=bose, 104=tirumala]
		System.out.println(lm);
		lm.remove(104);
		System.out.println(lm);//{101=subhash, 102=chandra, 103=bose}
		}}
