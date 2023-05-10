package practice;

public class TwoArrayDimensionalTask {
	char darr[][]={{'a','b','c'},
		           {'d','e','f','g','h'},
		           {'i','j','k','l','m','n','o'},
		           {'p','q','r','s','t','u','v','w','x'}};
	
	
	public void checkTwoArrDemo()
	{
		
		System.out.println(darr.length);         //Returns number of rows	
		System.out.println(darr[2].length);      //Returns number of columns
		System.out.println(darr[1][4]);
		System.out.println("LOOPING");
		
		
		for (char row=0;row<darr.length;row++) 
		{
			for(char col=0;col<darr[row].length;col++)
			{
				System.out.print(darr[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("ENHANCED FOR LOOP");
		for (char  []k : darr)
		{
			for(char j:k)
			{
				System.out.print(j+" ");
			}
			
		System.out.println();
		}
	}
public static void main (String args[])
 {
	TwoArrayDimensionalTask d =new TwoArrayDimensionalTask();
			 d.checkTwoArrDemo();
 }
}



