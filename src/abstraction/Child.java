package abstraction;

public class Child extends Parent{

	@Override
	public void goldwatch() {
		
		System.out.println("This is child's gold watch");
	}

public void schoolbag() {
		
		System.out.println("This is child's schoolbag");
	}

public static void main (String args[])
{
	Child c =new Child();
	c.schoolbag();
	c.goldwatch();
	c.goldjewels();
	
	
	
}
}
