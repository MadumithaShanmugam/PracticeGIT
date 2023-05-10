package practice;

public class nestedLoop {

	
	public void printStar()
	{
		for(int row=1; row<=5;row++)
		{
			for(int col=1; col<=5;col++)
			{
				if ((row%2==1 && col%2==1)|| (row%2==0 && col%2==0))
				{
					System.out.println("* ");
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main (String args[])
	{
		nestedLoop n =new nestedLoop();
		n.printStar();
	}
}