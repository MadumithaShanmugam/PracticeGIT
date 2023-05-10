package practice;

public class ForLoopMulti {
	
	public void checkFLM()
	{
		int sum=0;
	for(int num=20;num<=30;num++)
	{
		sum=sum+num;
		System.out.println(sum);
	}	
	}
	
	public static void main (String agrs[])
	{
		ForLoopMulti m=new ForLoopMulti();
				m.checkFLM();

}
}
