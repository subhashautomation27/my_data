class A12 
{
	public  void aa()
	{
		System.out.println("parent prop");
	}


public static void test1()
{
	
	System.out.println("g");
}
}

public class Tst  extends A12{
	public void aa()
	{  super.aa();//super.aa();
		//System.out.println("child pro");
	}
	
	public static void main(String[] args) {
		
		Tst t=new Tst();
		t.aa();
	}
	
	

}
