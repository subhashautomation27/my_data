



public class DemoStatic {
	
	static int i=23400;
	int j=200;
	public void check()
	{
             int k=300;
		System.out.println(k);
	}
public static void main(String[] args) {
		
DemoStatic ds=new DemoStatic();
		System.out.println(i);//100 //first case 
		System.out.println(ds.j);//200
		//System.out.println(ds.k);==>cont use k here bcoz local variable.
		ds.check();
		
		DemoStatic ds1=new DemoStatic();// second case . changing the value.
		//ds1.i=10000;
		//ds1.j=20000;
		System.out.println(i);//100==>10000. value changed for ds1.i.that value affcted ds2.i also.bcoz static
		//vari
		System.out.println(ds1.j);//200==>20000 .here only this obj value will be changed bcoz its instant variable
		
		DemoStatic ds2=new DemoStatic();
		System.out.println(i);//100==>10000==>this is static its effected all objects after changed value
		System.out.println(ds2.j);//200==>200 only.bcoz here value cant changed for ds2.j .changed only ds1.j
		
}
	}


