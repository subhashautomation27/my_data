




public class StaticVariableDemo {
	 static int i=10;// static variable
	 static void test()//static  method
	 {
		 System.out.println(i); }
        int j=20;//Instant variable
        public void test1(){
       int k=30;//local variable
        	System.out.println(k);        }
        public static void main(String[] args) {
		System.out.println(i);//10
		StaticVariableDemo s=new StaticVariableDemo();
		System.out.println(s.j);//20
		s.test1();//30
		test();//10
		}}
