package practice;

public class LogicalOperator {
	int a=40; int b=53; int c=60; int d=40;              //variable name //datatype varname=data;
	public void check_Logical_Demo()      //method   //public void method name()
	{
		System.out.println("##Logical operators for AND##");
		System.out.println(a >b && a==d);
		System.out.println(c<b || c!=d);
		System.out.println("##Logical operators for OR##");
		System.out.println(b<d && c >a);
		System.out.println(a==d || c<a);
		System.out.println("##Logical operators for NOT##");
		System.out.println(!(a==d));
	}
	public static void main (String args[])   //main method public static void main (String args[])
	{
		LogicalOperator l= new LogicalOperator(); // object  //class name object name=new constructor();
		l.check_Logical_Demo() ;           //method call using object // object name. method name();
	}
}
