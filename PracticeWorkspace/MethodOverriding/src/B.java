public class B  extends A{
     public void test(int i){
		System.out.println("retesting successdully ");}
public static void main(String[] args) {
		B b=new B();
		b.test(10); 
		A a1=new A();
		a1.test(10);}}
