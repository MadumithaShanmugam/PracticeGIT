package practice;

public class Relational_Operator {
	int a=40; int b=60;                //variable name //datatype varname=data;
	public void demo_Relational()           //method   //public void method name()
	{
		System.out.println(a<b);           //statement  //System.out.println(); 
		System.out.println(a>b); 
		System.out.println(a<=b); 
		System.out.println(a>=b); 
		System.out.println(a!=b); 	
		System.out.println(a==b);
		
	}
	public static void main (String args[])   //main method public static void main (String args[])
	{
		Relational_Operator r= new Relational_Operator(); // object  //class name object name=new constructor();
		r. demo_Relational() ;           //method call using object // object name. method name();
	}
	}


