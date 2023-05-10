package constructor;

public class Default_Constructor {  //variable declaration
	
	int a;
	double b;
	char p;
	String v;

	public Default_Constructor()
	{
	System.out.println("This is my default constructor ");
      a=5;
      b=9.5;
      p='P';
      v="****";
      System.out.println();
        
}

	public void display() 
	{
		 System.out.println("*int *"); 	
		 System.out.println(a); 	
		 System.out.println(); 
		 System.out.println("*double*"); 
		 System.out.println(b); 	
		 System.out.println();
		 System.out.println("*char*"); 
		 System.out.println(p); 	
		 System.out.println();
		 System.out.println("*String*"); 
		 System.out.println(v); 	
		 System.out.println();
	}
public static void main (String args[])
{
	Default_Constructor d =new Default_Constructor();
			d.display();
}
}