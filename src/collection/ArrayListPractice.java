package collection;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String args[])
	{
		ArrayList<Object>a =new ArrayList<>();
		
		a.add("Listen");
		a.add("Music");
		a.add(63);
		a.add('b');
		a.add(true);
		a.add("COLLECTION");
		a.add("Listen");
		System.out.println(a);
		
		int f=a.indexOf(63);
		System.out.println(f);
		
		int k=a.lastIndexOf("Listen");
		System.out.println(k);
		
		Object j=a.get(2);
		System.out.println(j);
		
		int size=a.size();
		System.out.println(size);

		a.set(4,"EVERYDAY");
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		a.remove(true);
		System.out.println(a);
	
		ArrayList<Object>c =new ArrayList<>();
		c.addAll(a);
		System.out.println(c);
		
	    c.clear();
	    System.out.println(c);
	    System.out.println();
	
	    System.out.println("USING NORMAL LOOP");
	    
	    for(int i=0;i<a.size();i++)
	    {
	    	System.out.println(a.get(i));
	    }
	    System.out.println();
	    System.out.println("USING ENHANCED FOR LOOP");
	    for(Object m:a)
	    {
	    	System.out.println(m);
	    }
	    System.out.println();
	    System.out.println("USING ITERATOR METHOD");
	    Iterator<Object>v=a.iterator();
	    
	    
	    while(v.hasNext())
	    {
	    	System.out.print(v.next());
	    }
	    System.out.println();
	    System.out.println("USING LAMBDA EXPRESSION");
	    a.forEach(x->System.out.println(x));

	}
}