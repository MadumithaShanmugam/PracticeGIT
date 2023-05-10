package constructor;

public class Final {      //cannot extend
	
final	int a=40;	
	char r='v';
	
	
public final void practice()     //cannot be overriden
	{
   System.out.println(a+r); 
}

public static void main (String args[])
{
	Final f =new Final();
			f.practice();
}
}