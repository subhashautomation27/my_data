
public class AA {
	
	 int z=500;
	 final  int i=200;// instant or non staic 
	static int j=200;   //static var
    public void test()
    {
    	int k=200;// local vari 
    } 
    
    public static void test1()
    {
    	System.out.println("ssdgsg");
    }
    public static void main(String[] args) {
    	 AA a=new AA();
    	 AA a1=new AA();
    	 System.out.println(a1.i);
    	 
    	// a1.i=300;
    	 a.z=600 ;
    	 System.out.println(a.i);
    	 System.out.println(j);
    	// System.out.println(k);
    	 System.out.println(a.z);
    	 a.test1();
    	 
		 
	}
}

 
