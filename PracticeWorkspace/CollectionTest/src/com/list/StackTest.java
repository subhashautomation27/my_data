package com.list;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
     Stack s =new Stack();
     s.push("subhash");
     s.push("hello");
     s.push("test");
     s.push(100);
     System.out.println(s);//[subhash, hello, test, 100]
    // return and removing the top of the element 
     s.pop();
     System.out.println(s);//[subhash, hello, test]
     //returning the top of the element without remove.
     s.peek();
     System.out.println(s);//[subhash, hello, test]
     System.out.println(s.size());//3
     System.out.println(s.capacity());//10
     System.out.println(s.empty());//false bcoz s is not empty 
    System.out.println( s.search("test"));// return 1
   }}
