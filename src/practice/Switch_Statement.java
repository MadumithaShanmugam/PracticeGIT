package practice;

public class Switch_Statement {

	 String proof = "Biomedical";
		
		public void checkSwitch()
		{
			switch(proof)  
			{
			case "Bcom":
				System.out.println(proof +" is a greate future for medical feild ");
				break;
				
			case "Bsc":
				System.out.println(proof +" is a greate future for medical feild ");
				break;
				
			case "Biotechnology":
				System.out.println(proof +" is a greate future for medical feild ");
				break;
				
			case "Biomedical":
				System.out.println(proof +" is a greate future for medical feild ");
				break;
	
			}
		}
		
		
		public static void main(String args [])
		
		{
			Switch_Statement s = new Switch_Statement();    
			s.checkSwitch();                           
		}

	}

