package com.map;
import java.util.ArrayList;
 class Student implements Comparable{
	  int rollno;
	  String name;
	  int Age;
	  
	  public Student(int rollno,String name,int age) {
		   this.rollno=rollno;
		   this.name=name;
		   this.Age=age;      }
	  
	  public int compareTo(Object o) {
		  if (Age==o.age)
			  return 0;
		  else if(Age>o.age)
			  return 1;
		  else
			  return -1; }}

public class CompareTest {
public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(100,"subhash",24));
		System.out.println(al);}}

