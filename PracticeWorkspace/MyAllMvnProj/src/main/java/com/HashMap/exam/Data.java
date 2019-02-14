package com.HashMap.exam;
import java.util.HashMap;
import com.BaseClass.BaseTestClass;
public class Data  extends BaseTestClass{
	
	 public HashMap<String,String> getuserfreecrmlogininfo() {
		 HashMap<String, String> usermap=new HashMap<String, String>();
		 usermap.put("ceo", "naveenk_test@123");
		 usermap.put("magagingdirector", "adminuser_test@123");
		 //usermap.put("test", "teat@gmail.com_test123");
		 return usermap;}
	 
	 public HashMap<String,String> getusergmaillogininfo(){
		 HashMap<String, String> usermap=new HashMap<String, String>();
		 usermap.put("subhash", "subhash.tirumala@gmail.com_HASFDHY123");
		 usermap.put("sarru", "subhashtoachive@gmail.com_HSFDREY543");
		 usermap.put("test", "teat@gmail.com_test123");
		 return usermap;}
	 
	 public HashMap<Integer,String> monthmap() {
		 HashMap<Integer, String> monthmap=new HashMap<Integer, String>();
		 monthmap.put(1, "January");
		 monthmap.put(2, "February");
		 monthmap.put(3, "March");
		 monthmap.put(4, "April");
		 monthmap.put(5, "May");
		 monthmap.put(6, "Jun");
		 monthmap.put(7, "July");
		 monthmap.put(8, "Auguest");
		 monthmap.put(9, "Septmber");
		 monthmap.put(10, "October");
		 monthmap.put(11, "November");
		 monthmap.put(12, "December");
		 return monthmap; }} 
	 

		 
