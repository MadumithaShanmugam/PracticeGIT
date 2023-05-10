package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main (String args[])
	{
		HashSet<Object>h=new HashSet<>();
		
		h.add("Listen");
		h.add("Music");
		h.add(63);
		h.add('b');
		h.add(true);
		h.add("COLLECTION");
		h.add("Listen");
		System.out.println(h);
		
		boolean contains = h.contains("Tech");
		System.out.println(contains);
		
		boolean contains1 = h.contains("Music");
		System.out.println(contains1);
		
		int size = h.size();
		System.out.println(size);
		
		h.remove(true);
		System.out.println(h);
		
		System.out.println();
		System.out.println("ARRAY");
		Object[] arr= h.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("USING ENHANCED FOR LOOP");
		for(Object k:h)
		{
			System.out.println(k);
		}
		System.out.println();
		System.out.println("USING ITERATOR METHOD");
		Iterator<Object>i =h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());	
		}
		System.out.println();
		System.out.println("USING LAMBDA EXPRESSION");
		h.forEach(k->System.out.println(k));
	}

}
