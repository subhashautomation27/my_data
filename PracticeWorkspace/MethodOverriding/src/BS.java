public class BS extends AS{
     public void add(int a, float b){
		System.out.println(a+b);}
	
	//method overloading
	public void bikeDesign(float cc){
		System.out.println("child implementation  :"+cc);}
	
	//method overriding
	public void bikeDesign(int cc){
		System.out.println("child implementation  :"+cc);}
	
	public static void main(String[] args) {
		BS obj=new BS();
		obj.bikeDesign(90.43f);}}
