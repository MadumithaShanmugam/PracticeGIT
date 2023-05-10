package polymorphism;

public class Return_demo {

	public void arrayReturn()
	{
		int arr[]= {68,72,95,47,83};
		System.out.println(arr[2]);
		System.out.println(arr.length);
		System.out.println();
		
		for(int w=0; w<arr.length;w++)
		{
			System.out.println(arr[w]);
		}
		System.out.println();
	}
	public void arrayReturn(int z[])
	{
		for(int w=z.length-1;w>=0;w--)
		{
			System.out.println(z[w]);
		}
		System.out.println();
	}
	public int[] returnArr(int darr[])
	{
		return darr;
	}
	public static void main (String args[])
	{
		 Return_demo m=new  Return_demo();
		 m.arrayReturn();
		 int z[]= {27,37,47,57};
		 m.arrayReturn(z);
		 
		 int darr[]= {6,9,7};
		 
			 for (int w=0;w<darr.length;w++)
			 {
				 System.out.println(darr[w]);
			 }
		 }

}
