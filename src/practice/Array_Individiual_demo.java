package practice;

public class Array_Individiual_demo {
	String agr[]= {"Mango","Pineapple","Banana","Guva","Watermelon","Grapes","Jack fruit","Orange","kiwi"};
	
		public void checkArray()
		{
			System.out.println(agr.length);
			System.out.println(agr[3]);
			System.out.println(agr[7]);
			System.out.println("FOR LOOP CONDITION");
			for (int i=0;i<agr.length;i++)
			{
				System.out.println(agr[i]);
		}
			System.out.println("REVERSE");
			for(int i=agr.length-1;i>0;i--)
			{
				System.out.println(agr[i]);
			}
			System.out.println("ENHANCED FOR LOOP");
			for(String k: agr)
			{
				System.out.println(k);
			}
	}
public static void main (String args[])
{
	Array_Individiual_demo a = new Array_Individiual_demo();
			a.checkArray();
}
}
