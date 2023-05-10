package statickeyword;

import java.util.Scanner;

public class UserinPutMethod {

	public static void main(String args[])
	{
		System.out.println("Enter the two numbers : ");
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	//	String nextLine = sc.nextLine();
	//    double nextDouble=sc.nextDouble();
		
		System.out.println(num1+num2);
	}

}
