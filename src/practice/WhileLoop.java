package practice;

public class WhileLoop {
	int num=10;
	public void WhileDemo()
	{
while(num>=1)
{
	System.out.println(num);
	--num;
}
System.out.println("Finished");
}
	public static void main (String args[])
	{
		WhileLoop w = new WhileLoop();
				System.out.println("THE VALUE NUM 10 DECREMENT TO 1");
				w.WhileDemo();
	}
}
