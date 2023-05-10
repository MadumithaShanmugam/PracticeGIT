package practice;

public class StringDemo {
	
	public void checkString()
	{
		String s="Hello World";             //String literal---->SCP
		String s1= new String("Hello World");          //heap memory
		String s2="Hello World";            //sCP
		String s3="Welcome";
		
		
		//equal------>method
		//== ------->operator
		//Equals ---->content comparision of the string 
		//== -------> Address comparision of the string
		
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		System.out.println(s==s1);     //  it store in heap memory false
		System.out.println(s==s3);
	
	}
public static void main (String args[])
{
	StringDemo d =new StringDemo();
        d.checkString();
}
}
