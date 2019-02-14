
//package packPolymorphism;

public class AS {
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(int a, int b,int c){
		System.out.println(a+b+c);
	}
	
	public void add(float a, float b){
		System.out.println(a+b);
	}
	
	public void bikeDesign(int cc){
		System.out.println("parent implementation  :"+cc);
	}
	public static void main(String[] args) {
		AS obj=new AS();
		obj.add(11, 22);
		obj.add(11, 22, 33);
		obj.add(11.2f, 34.43f);
	}

}

