package practice;

public class MethodOops {
	
	public void methodType1()
	{
		int a=4 ,b=8 ;
		System.out.println("Without Parameters");
		System.out.println(a+b);	
	}
	public void methodType2(int a , int b)
	{
		System.out.println("With Parameters");
		System.out.println(a*b);	
	}
	public int methodType3()
	{
		int a=12 ,b=17 ;
		System.out.println("Without Parameters with return type");
		return a-b;
	}
	public int methodType4(int a , int b)
	{
	System.out.println("With Parameters with return type");
	return a+b;
	}
	
	public static void main(String args[])
	{
		MethodOops m=new MethodOops();
		m.methodType1();
		m.methodType2(15,23);
		int value = m.methodType3();
		System.out.println(value);
		int num= m.methodType4(1,2);
		System.out.println(num);
		
	}
}
