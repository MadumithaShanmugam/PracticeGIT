package constructor;

public class ThisDemo {
	
int a;

public  ThisDemo()
{
	this(20,35);
	a=57;
	System.out.println(a);
}
public ThisDemo (int a, int b)
{
	this("UV1","MUSIC");
	System.out.println(a+b);	
}
public ThisDemo(String a, String b)
{
	System.out.println(a+b);
}

public static void main (String args[])
{
	new ThisDemo();
}


}
