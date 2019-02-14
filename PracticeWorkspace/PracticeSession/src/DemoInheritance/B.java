package DemoInheritance;

public class B extends A{
	
	public void add()
	{ 
		System.out.println("This is b class add funct ");
	}
	
     public void show()
	{
		
		super.add();
	}
	public static void main(String[] args) {
		
		B b1=new B();
		 b1.show();
		 }}
