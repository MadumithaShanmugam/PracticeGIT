package practice;

public class ForLoop {
	
	public void checkFL()
	{
		int sum=0;
	for(int num=20;num<=30;num++)
	{
		sum=sum+num;
	}
		System.out.println(sum);
		
	}
	
	public static void main (String agrs[])
	{
		ForLoop f=new ForLoop();
				f.checkFL();

}
}
