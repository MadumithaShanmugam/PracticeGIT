package practice;

public class JumpingBreak {

int num=50;
public void jbreak()
{
	for (int num=50;num<=60;num++)
	{
		if (num==58)
		{
			break;
			
		}
		System.out.println(num);
	}
}
public static void main(String args[])
{
	JumpingBreak b= new JumpingBreak();
	b.jbreak();
	}
}
