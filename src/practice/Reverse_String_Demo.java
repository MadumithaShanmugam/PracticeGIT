package practice;

public class Reverse_String_Demo {
	
		public static void main(String[] args)
		{
	
		String s="LEARNING IS PROCESS";
		String revstr=" ";
		
	for (int i=s.length()-1;i>=0;i--)  
		{
		revstr = revstr + s.charAt(i);
		}
		System.out.println(revstr);
	}
}
