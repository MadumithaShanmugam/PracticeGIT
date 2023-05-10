package practice;

public class Increment_Decrement {
	int a=40;
	public void check_Increment_Decrement_Demo() 
	{
		System.out.println("PRE INCREMENT");
		System.out.println(a++);
		System.out.println("POST INCREMENT");
		System.out.println(++a);
		System.out.println("PRE DECREMENT");
		System.out.println(a--);
		System.out.println("POST DECREMENT");
		System.out.println(--a);
	}
	public static void main(String args[])
	{
		Increment_Decrement  c= new Increment_Decrement ();
		c.check_Increment_Decrement_Demo();
		
		}
}
