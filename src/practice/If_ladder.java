package practice;

public class If_ladder {
	
String month= "May"; 
	
	public void checkIfElseIFLadder()
	{
		if (month== "January")   
		{
			System.out.println("1");
		}
		else if (month== "February")  
		{
			System.out.println("2");
		}                             
		else if (month== "March")  
		{
			System.out.println("3");
		}
		else if (month== "APril")
		{
		System.out.println("4");
		}
		else if (month== "May")
		{
			System.out.println("5");
		}
	}
	
	
public static void main(String[] args) 
{
	If_ladder i = new If_ladder();
	System.out.println("Provide the value month number is");
	i.checkIfElseIFLadder();
	
}
}


