package practice;

public class Short_Hand_Operator {
	 int a=40;  int b=60;          //variable name	

	 public void check_S_Hand_Operator()   //method
	 {
		 a+=b;
	 System.out.println(a); //statement
		 b+=a;
	 System.out.println(b);
		 a-=b;
     System.out.println(a);
       a*=b;
    System.out.println(a);
       a/=b;
    System.out.println(a);
    a%=b;
    System.out.println(b);
  			 
	 }
	 public static void main (String args [])   // main method
	 {
		 Short_Hand_Operator h= new Short_Hand_Operator();   //objection creation or instance
	 			h.check_S_Hand_Operator();            //method call using object.
	 			
	 }
	 

}
