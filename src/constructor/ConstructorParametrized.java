package constructor;

public class ConstructorParametrized {
	
		int a;
		
		public ConstructorParametrized()
		{
			a=20;
			System.out.println(a);
		}

		public ConstructorParametrized(int a,int b)
		{
			System.out.println(a+b);
		}

		public ConstructorParametrized(int a,double r)
		{
			System.out.println(a+r);
		}

		public ConstructorParametrized(int a,double r,int c)
		{
			System.out.println(a+r+c);
		}
		public ConstructorParametrized(String w, String k)
		{
			System.out.println(w+k);
		}

        public static void main (String args[])
		{
			new ConstructorParametrized();
			new ConstructorParametrized(10,20);
			new ConstructorParametrized(10,23.2);
		    new ConstructorParametrized(10,3.2,3);
			new ConstructorParametrized("constructor" , "default");

		}
		}

