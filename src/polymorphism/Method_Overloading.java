package polymorphism;

public class Method_Overloading {
	
	public void staticBinding()
	{
		int i=35 , k=49;
		System.out.println(i+k);	
	}
	
	public int staticBinding(int i, int k)
	{
		return i+k;
	}
	
	public int staticBinding(int i, int k, int q)    //number of arguments
	{
		return i+k+q;
	}
	
	public double staticBinding(int i , double k) ///types of arguments
	{
		return i+k;
	}
	
	public double staticBinding( double k,int i) //order of arguments
	{
		return k+i;
	}
	

	public static void main (String args[])
	{
		 Method_Overloading l=new  Method_Overloading();
		l.staticBinding();
		System.out.println(l.staticBinding(34,89));  //returning the value
		int staticBinding= l.staticBinding(12,78,90);
		System.out.println(staticBinding);
		
	   double staticBinding2 =l.staticBinding(12,78.9);
	   System.out.println(staticBinding2);
	
	   double staticBinding3 =l.staticBinding(89.5,17);
	  System.out.println(staticBinding3);
 
	}
	
}
