package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {


	public static void main(String args[])
	{
		ArrayList<Character>l1=new ArrayList<>();
		System.out.println("CHARACTER");
		l1.add('g');
		System.out.println(l1);
		System.out.println();
		
		ArrayList<Boolean>l2=new ArrayList<>();
		System.out.println("BOOLEAN");
		l2.add(null);
		System.out.println(l2);
		System.out.println();
		
		ArrayList<Object>l=new ArrayList<>();
		
		l.add(87);
		l.add('*');
		l.add(27.5);
		l.add("true");
		l.add(true);
		System.out.println(l);
		System.out.println();
		
		System.out.println("SIZE");
		int f=l.size();
		System.out.println(f);
		System.out.println();
		
		System.out.println("INDEXOF");
		int g=l.indexOf(27.5);
		System.out.println(g);
		System.out.println();
		
		System.out.println("LASTINDEXOF");
		int n=l.lastIndexOf(true);
		System.out.println(n);
		System.out.println();
		
		System.out.println("SET");
		l.set(2, 3.2);
		System.out.println(l);
		System.out.println();
		System.out.println("REMOVE");
		l.remove(3);
		System.out.println(l);
		System.out.println();
		
		ArrayList<Object>d =new ArrayList<>();
		d.addAll(d);
		System.out.println(d);
		
		d.clear();
		System.out.println(d);
		System.out.println();

		System.out.println("FOR LOOP");
		for(int a=0;a<l.size();a++)
		{
			System.out.println(l);
		}
		
		System.out.println();
		System.out.println("REV LOOP");
		for(int i=l.size()-1; i>=0;i--)
		{
			System.out.println(l.get(i)+", ");	
		}
		System.out.println();
		System.out.println("ENHANCED LOOP");
		for (Object c:l)
		{
			System.out.println(c +", ");	
		}
		
		System.out.println();
		System.out.println("ITERATOR");
		Iterator<Object>j  =l.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());	
		}
		 System.out.println("USING LAMBDA EXPRESSION");
		    l.forEach(x->System.out.println(x));
	
}	
	}	

