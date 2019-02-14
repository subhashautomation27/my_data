package DemoInheritance;

public class C  extends B{
	public void add ()
	{
		System.out.println("This is c class add funn ");
	}
	public void display()
	{
		super.add();
	}

	public static void main(String[] args) {
	    C c1=new C();
        c1.display();
        c1.show();}}
