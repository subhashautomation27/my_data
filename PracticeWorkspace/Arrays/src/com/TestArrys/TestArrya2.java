package com.TestArrys;

import java.util.Arrays;

public class TestArrya2 {
public static void main(String[] args) {
	int z[]=new int[2];
	z[0]=10;
	z[1]=20;
	for (int i = 0; i < z.length; i++) {
		System.out.println(z[i]);}
	System.out.println(Arrays.toString(z));
	String [] x=new String[3];
	    x[0]="subhash";
	    x[1]="chandra";
	    x[2]="bose";
	    // for loop
	    for (int j = 0; j < x.length; j++) {
	    	System.out.println(x[j]);}
	    // for each loop 
	    for (String s : x ){
	    	System.out.println(s);
			}}}
