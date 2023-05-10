package practice;

public class DoWhileLoop {

	int num=21;
	public void checkDoWhileDemo()	{
   do {
	System.out.println(num);
	--num;
}
   while(num >=11);
System.out.println("Finished");
}
	public static void main (String args[])
	{
		DoWhileLoop w = new DoWhileLoop();
				System.out.println("THE VALUE NUM 21 DECREMENT TO 11");
				w.checkDoWhileDemo();
	}
}
