package practice;

public class ConditionalOperator {
    int a=40;  int b=60;          //variable name	

public void check_Conditional_Demo()   //method
{
System.out.println(a<b? "A is less than b" : "A is greater than B"); //statement
System.out.println(a>b? "B is greater than A" : "B is less than A");
}
public static void main (String args [])   // main method
{
	ConditionalOperator o= new ConditionalOperator();   //objection creation or instance
			o.check_Conditional_Demo();            //method call using object.
			
}
}
