package statickeyword;

public class StaticMethod {

	 static int a=100;     //instance variable  //static variable
	
	public  static void display()   //instance method //static method
	{
		System.out.println("Helo guys.....");
	}
	
	public static void main(String args[])
	{
		StaticMethod .display();
		System.out.println(StaticMethod .a);
	}
}
