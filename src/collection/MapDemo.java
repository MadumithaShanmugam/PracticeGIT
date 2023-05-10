package collection;

import java.util.Collection;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
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
		
	    int g =h.size();
	    System.out.println(g);
	    
	    Set<String> n=h.keySet();
	    for(String m:n ) 
	    {
	    	 System.out.println(m);
	    }
	    
	    Collection<Integer>b=h.values();
	    for (Integer c:b) 
	    {
	    	System.out.println(c);	
	    }
	    
	    Set<Entry<String,Integer>>k=h.entrySet();
	    for(Entry<String,Integer>l:k)
	    if(l.getKey()=="Social")
	    {
	    	System.out.println(l.getKey() +"==" +l.getValue());	
	    }
	    System.out.println(h.get("Computer"));	
	    System.out.println(h.get("computer"));	
	    
}
}