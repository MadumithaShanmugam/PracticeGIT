package practice;

public class For_Loop {
	
	public void for_Loop()	{
		for (int num=13 ; num>=1;--num) {
			System.out.println(num);
	}
	}
public void for_Loop_2() {
	for (int sum=1 ; sum<=13;sum++){
	System.out.println(sum);
}
}

public static void main (String args[])
{
	For_Loop l = new For_Loop();
     System.out.println("THE VALUE NUM 13 DECREMENT TO 1");
	l.for_Loop();
	
	System.out.println("THE VALUE NUM 1 INCREEMENT TO 13");
	l.for_Loop_2();
}
}