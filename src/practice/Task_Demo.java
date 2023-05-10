package practice;

public class Task_Demo {

	int a=20; int b=30; int c=40;
	double d=45.725;
	char x='%';
	boolean q=true;
	String s="d&j";
	
	public void script_In_Practice_Data_Type()
	{
		System.out.println(d);
		System.out.println(x);
		System.out.println(q);
		System.out.println(s);
		System.out.println(a-b); 
		System.out.println(a*b); 
		System.out.println(a/b); 
		System.out.println(a%b); 	
		System.out.println(a<b);                    //statement  //System.out.println(); 
		System.out.println(a>b);
	}
	public static void main (String args[])
	{
		Task_Demo t =new Task_Demo ();
				t.script_In_Practice_Data_Type();
	}
}
