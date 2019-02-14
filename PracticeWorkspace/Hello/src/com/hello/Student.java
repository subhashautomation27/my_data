package com.hello;
public class Student {
    int roolno;
    String name;
    String mobileno;
    float fee;
    // here instant variable and parameters both are same .will get ambiguity . 
      //to avoid to this problem use this keyword.
    public Student(int roolno,String name,String mobileno,float fee) {
    	this.roolno=roolno;
    	this. name=name;
    	this.mobileno=mobileno;
    	this.fee=fee;}
     public void displayStudentInfo()
    {
    	System.out.println(roolno + " "+ name + "" + mobileno + "" + fee);
    }
    public static void main(String[] args) {
		Student obj=new Student(100, "subhash" ,"8123232838",  4000 );
		Student obj1=new Student(101,"bose","9014383835" ,  6000);
		obj.displayStudentInfo();
		obj1.displayStudentInfo();}}
