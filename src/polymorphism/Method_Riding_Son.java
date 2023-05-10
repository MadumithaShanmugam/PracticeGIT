package polymorphism;

public class Method_Riding_Son extends  Method_overriding {
	
	public void pulsarR15()
	{
		System.out.println("This is Son's pulsarR15");
	}

	public void oneplus8t()
	{
		System.out.println("This is Son's oneplus8t");
	}

	public static void main (String args[])
	{
		Method_Riding_Son s= new Method_Riding_Son();
		s.pulsarR15();  //son
		System.out.println();
		s. Laptop();      //father
		s.oneplus8t();  //son own logic
		
		System.out.println();
		
		Method_overriding f=new Method_overriding();
		f.Laptop(); //father
		f.oneplus8t();  //father 
		
		System.out.println();
		
		Method_overriding v=new Method_Riding_Son();//up casting //creating a object for child class and giving the references to parent class
		v.Laptop(); //father
		v.oneplus8t(); //son
		//v.pulsarR15(); //invalid
	}
	
}
