package practice;

public class Control_Ife_Statement {

	int age=18;
	public void check_If_Demo()
	{
		if (age>=18)
		{
			System.out.println("NotEligible to vote");
		}
		else
		
		{
			System.out.println("eligible to vote");	
		}		
		if (age<=18)
		{
			System.out.println("Eligible to vote");
		}
		
		else
		{
			System.out.println("Not eligible to vote");	
		}	
	}
	public static void main (String args [])   // main method
	{
		Control_Ife_Statement e= new Control_Ife_Statement();   //objection creation or instance
				e.check_If_Demo();            //method call using object.
				
	}
}
