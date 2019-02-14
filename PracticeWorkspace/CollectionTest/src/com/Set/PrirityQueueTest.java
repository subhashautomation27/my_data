package com.Set;
import java.util.PriorityQueue;
import org.omg.Messaging.SyncScopeHelper;
public class PrirityQueueTest {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add("subhash");
		p.add("chandra");
		p.add("tirumala");
		p.add("bose");
		//p.add(100); // java.lang.ClassCastException
		//p.add(null);  //java.lang.NullPointerException
		p.add("subhash");
		System.out.println(p);//[bose, chandra, tirumala, subhash, subhash]. allow dupilicates
		System.out.println(p.poll());//bose --> delete first element
		System.out.println(p.peek());//chandra--> display first   element witjout delete 
		System.out.println(p.remove());// chandra --> remove first element
		System.out.println(p);}}
