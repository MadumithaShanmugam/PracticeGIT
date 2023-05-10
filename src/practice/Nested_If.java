package practice;

public class Nested_If {
		
int num =64;
	
	public void checkNestedIf()
	{
		if(num%2==0)
		{
			System.out.println(num +" is completely divisible by 2 ");
			
			if(num%4==0)        
			{
				System.out.println(num +" is completely divisible by 4");
				
				if(num%8==0)
				{
					System.out.println(num +" is completely divisible by 8");
					
					if(num%16==0)
					{
						System.out.println(num +" is completely divisible by 16 ");
					}
					else
					{
						System.out.println(num +" is not completely divisible by 2 ");
					}
				}
				else
				{
					System.out.println(num +" is not completely divisible by 4 ");
				}
			}
			else
			{
				System.out.println(num +" is not completely divisible by 8 ");
			}
		}
			else
			{
				System.out.println(num +" is not completely divisible by 16 ");
			}
		}


	public static void main (String args [])   // main method
	{
		Nested_If e= new Nested_If();   //objection creation or instance
				e.checkNestedIf();            //method call using object.
				
	}
}
