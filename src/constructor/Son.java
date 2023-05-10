package constructor;

public class Son extends Mother{
	

	public void pulsarR15()
	{
		System.out.println("This is Son's pulsarR15");
		super.gold();
		System.out.println(super.a);
	}

	public static void main (String args[])
{
		Son s=new Son();
		s.pulsarR15();		
}
}
