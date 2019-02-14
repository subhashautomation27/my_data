package com.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetTest {

	public static void main(String[] args) {
    LinkedHashSet h=new LinkedHashSet();
    h.add("subhash");
    h.add(100);
    h.add("test");
    h.add(100);
    System.out.println(h.size());
    System.out.println(h);//[subhash, 100, test]---> insertion order must be preserved
    System.out.println(h.add(100));}}//false bcoz 100 already is heir from list .duplicates not allowed

