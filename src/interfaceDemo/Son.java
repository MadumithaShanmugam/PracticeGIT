package interfaceDemo;

public class Son implements Father ,GrandFather  {
	
	public void pulsarR15()
	{
		System.out.println("This is Son's pulsarR15");
	}

	@Override
	public void vegFoodVariety() 
	{
		
		System.out.println("This is Father vegFoodVariety");
		
	}
	
	@Override
	public void ambassadorcar1() 
	{
		System.out.println("This is Son's ambassadorcar");
		
	}
	
	public static void main(String args[])
	{
		Son s=new Son();
		s.pulsarR15();
		s.vegFoodVariety();
		s.ambassadorcar1();
		System.out.println(s.wheels);
     //		     s.wheels=89799;//we cannot change the static constant in an interface
		
		//Father f=new Father();//it contains abstract method , so we cannot create an object
	

}


}