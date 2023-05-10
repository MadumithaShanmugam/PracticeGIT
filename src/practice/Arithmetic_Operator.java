package practice;

public class Arithmetic_Operator {     //class name
	int a=40; int b=60;                //variable name //datatype varname=data;
public void add_The_Number()           //method   //public void method name()
{
	System.out.println(a+b);           //statement  //System.out.println(); 
	System.out.println(a-b); 
	System.out.println(a*b); 
	System.out.println(a/b); 
	System.out.println(a%b); 	
}
public static void main (String args[])   //main method public static void main (String args[])
{
	Arithmetic_Operator a= new Arithmetic_Operator(); // object  //class name object name=new constructor();
	a.add_The_Number() ;           //method call using object // object name. method name();
}
}
