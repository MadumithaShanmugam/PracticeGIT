package practice;

public class String_Builder_Demo {
	

public static void main(String[] args) {
		
	StringBuilder sb = new StringBuilder(" FLEXIBILITY AND ");  
	System.out.println(sb); 
	System.out.println(sb.hashCode());
	
	sb.append(" ENDURANCE");
	System.out.println(sb); 
	System.out.println(sb.hashCode());
	
	sb.insert(1,"IMPROVES ");
	System.out.println(sb);
	
	sb.reverse();
	System.out.println(sb.hashCode());
	
	sb.replace(1,3,"QUALITY OF LIFE ");
	System.out.println(sb); 
	System.out.println(sb.hashCode());

}
}

