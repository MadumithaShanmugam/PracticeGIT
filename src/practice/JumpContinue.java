package practice;

public class JumpContinue {
	int num=20;
	public void jContinue()
	{
		for (int num=21;num<=35;num++)
		{
			if (num==25 || num==30)
			{
				continue;
				
			}
			System.out.println(num);
		}
	}
	public static void main(String args[])
	{
		JumpContinue d= new JumpContinue();
		d.jContinue();
		}
	}
	


