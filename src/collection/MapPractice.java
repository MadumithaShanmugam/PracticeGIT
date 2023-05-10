package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main (String args[])
	{
		HashMap<String, Integer>h=new HashMap <>();

		h.put("English",89);
		h.put("Tamil",70);
		h.put("Science",78);
		h.put("Biomaths",75);
		h.put(null,69);
		h.put("Social",68);
		h.put("Computer",80);
		System.out.println(h);
		
		System.out.println();
		System.out.println("ITERATING ONLY THE KEY");
		
		Set<String> n=h.keySet();
	    for(String m:n ) 
	    {
	    	 System.out.println(m);
	    }
	    System.out.println();
	    System.out.println("ITERATING ONLY THE VALUES");
	    Collection<Integer>values=h.values();
	    for (Integer c:values) 
	    {
	    	System.out.println(c);	
	    }
	    Set<Entry<String,Integer>>entrySet=h.entrySet();
	    for(Entry<String,Integer>i:entrySet)
	    {
	    	System.out.println(i.getKey()+"=="+i.getValue());
	    }
	    System.out.println();
		System.out.println("ONLY THE VALUE");
	
		 for(Entry<String,Integer>f:entrySet)
		 {
			 if(f.getKey()=="Computer")
			 {
				 System.out.println(f.getValue()); 
			 }
		 }
    	System.out.println("ITERATING VALUE USING GET KEY");
    	System.out.println(h.get("Biomaths"));
} 
}