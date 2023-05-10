package practice;

public class Two_Dimensional {
	
	int darr[][]= {{1,2,3,4},
			{5,6,7,8,9},
			{10,11,12,13,14,15},
			{16,17,18,19,20,21,22,23},
			{24,25,26,27,28,29,30,31,32,33}};

	public void checkTwoDemo()
	{
		
		System.out.println(darr.length);         //Returns number of rows	
		System.out.println(darr[4].length);      //Returns number of columns
		System.out.println(darr[1][2]);
		System.out.println("LOOPING");
		
	
		for (int row=0;row<darr.length;row++) 
		{
			for(int col=0;col<darr[row].length;col++)
			{
				System.out.print(darr[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("ENHANCED FOR LOOP");
		for (int  []k : darr)
		{
			for(int j:k)
			{
				System.out.print(j+" ");
			}
			
		System.out.println();
		}
	}
public static void main (String args[])
 {
	 Two_Dimensional d =new Two_Dimensional();
			 d.checkTwoDemo();
 }
}
