package outsidepackage;

import abstraction.Sample;

public class Outside {
	
	public static void main(String args[])
	{
		Sample s=new Sample();
		s.display();
		System.out.println(s.wheels);
	}

}
