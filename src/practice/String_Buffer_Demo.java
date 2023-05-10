package practice;

public class String_Buffer_Demo {
	
	public static void main (String args[])

	{
	StringBuffer sb = new StringBuffer(" THE WORDS FAIL");
		System.out.println(sb); 
		System.out.println(sb.hashCode());
		
		sb.append("MUSIC SPEAKS");
		System.out.println(sb); 
		System.out.println(sb.hashCode());
		
		sb.insert(1,"WHERE");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb.hashCode());
		
		sb.replace(1,3,"MOMENT");
		System.out.println(sb); 
		System.out.println(sb.hashCode());
		
		
	}
	}

