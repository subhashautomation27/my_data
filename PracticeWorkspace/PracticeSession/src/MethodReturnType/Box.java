package MethodReturnType;

public class Box {
int width;
int lenth;
public void calcuteArea() {
int total = width * lenth;
System.out.println(total);}
		// return total;
public void calcuteArea(int width) {
int total = width * lenth;
System.out.println(total);}
		// return total;}
public void calcuteArea(int width, int length) {
int total = width * lenth;
		System.out.println(total); }}
		// return total;}}
