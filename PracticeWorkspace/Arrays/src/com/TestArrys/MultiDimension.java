package com.TestArrys;
public class MultiDimension {
	public static void main(String[] args) {
		int a[][]=new int [3][2];
		a[0][0]=20;
		a[0][1]=30;
		
		a[1][0]=50;
		a[1][1]=60;
		a[2][0]=70;
	    a[2][1]=80;
		for (int i = 0; i < a.length; i++) {
			
		for (int j = 0; j < a[i].length; j++) {
			System.out.println(a[i][j]);}}
		
		int a1[][]={{1,2,3},{4,5,6},{5,6,7}};
		for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 System.out.println(a1[i][j] + "  ");
				}
			 System.out.println();}}}
