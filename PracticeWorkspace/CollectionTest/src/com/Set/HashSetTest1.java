package com.Set;
import java.util.HashSet;
import java.util.Iterator;
class Book{
	int id;
	String name,author,publisher;
	int quntatity ;
	String date;

public Book(int id,String name, String author, String publisher,int quntatity,String date){
	this.author=author;
	this.id=id;
	this.name=name;
	this.publisher=publisher;
	this.quntatity=quntatity;
	this.date=date;}}
public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet<Book> h=new HashSet<Book>();
		Book b1=new Book(100,"mister world","subhash" ,"times of india", 20000, "2108-11-10");
		Book b2=new Book(101,"peace of mind","chandra" ,"the hindu", 30000,"2108-10-10");
		Book b3=new Book(102,"mister","bose" ,"ssss", 23000,"2108-11-10");
		Book b4=new Book(103,"LAxman 281 beyond the story","tirumala" ,"ASD", 10000000,"2108-11-10");
		
            h.add(b1);
            h.add(b2);
            h.add(b3);
            h.add(b4);
            
            System.out.println();
     /*for (Book object : h) {
    	 System.out.println(object.id+ " "+object.author+" "+object.name+ " "+object.publisher+ " "+object.date);
        }*/
            
            Iterator<Book> i1=h.iterator();
            while (i1.hasNext()) {
				Book book = (Book) i1.next();
				System.out.println(book.author+" "+book.date+" "+book.id+" "+book.publisher+" "+book.quntatity);
				
			}
     }}
