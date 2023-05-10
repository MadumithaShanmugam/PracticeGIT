package inheritance_Types;

public class Daugther extends Father{
	
	public void BMWCar()
	 {
		 System.out.println("This is daugther BMWCar");
	 }
	 
	 public void FashinoBike()
	 {
		 System.out.println("This is daugther FashinoBike");
	 }

	 public static void main (String args[])
	 {
	 	Son s =new Son();
	 	 System.out.println("HIERARCHICAL INHERITANCE "); 
	 	 s.dessert();         //son
	 	 s.juice();            //son
	 	 System.out.println();
	 	 
	 	 Father f=new  Father();
	 	 f.vegFoodVariety();
	 	 f.nonVegFoodVariety();
	 	 System.out.println();
	 	 
	 	Daugther d=new Daugther();
	 	d.BMWCar();
	 	d.FashinoBike();
	 	System.out.println();	 	 
}
}