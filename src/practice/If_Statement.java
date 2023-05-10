package practice;

public class If_Statement {
	
		int a=40; int b=60;
		public void check_If_Statement()
		{
			if (a<b && a>b);
			{
				System.out.println("If statement using AND");
				System.out.println("A IS LEESER THAN B");	
			}
			
			if (a>b || a>b);
			{
				System.out.println("If statement using OR");
				System.out.println("B IS GREATER THAN A");	
			}		
		}
		public static void main (String args [])   // main method
		{
			If_Statement f= new If_Statement();   //objection creation or instance
					f.check_If_Statement();            //method call using object.
					
		}
}
		
		
		
