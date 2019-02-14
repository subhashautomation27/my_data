
 package com.hello;
 interface I{
  int f();
}

interface B{
  int f();
}

class D implements I, B{   
  public static void main(String... args) throws Exception{  
	  System.out.println("exception");

  }

  @Override
  public int f() {  // from which interface A or B
    return 0;
  }
}  

