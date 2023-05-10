package practice;

public class ControlConditionalStatement {
	public void test() {
		int mind =1;
		for (int num =1; num<=5;num++) {
			mind *=num;
			System.out.println(mind);
		}
		System.out.println("FINAL ANSWER IS "+ mind);
	}
	public static void main (String args [])   // main method
	{
		ControlConditionalStatement c= new ControlConditionalStatement ();   //objection creation or instance
				c.test();            //method call using object.
				
	}
}
