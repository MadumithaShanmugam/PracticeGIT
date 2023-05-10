package statickeyword;

public class StaticBlock {

int Studentid;
String Studentname;
static String collageName;

static
{
 collageName="SRM Institute Of Science And Technolgy";
}

public void displayInfo(int a,String b,String c)
{
	
this.Studentid=a;
this.Studentname=b;
//StaticBlock.collageName=collageName;

	System.out.println("Student id number :"+a);
	System.out.println("Student Name is :"+b);
	System.out.println("Collage Name is :"+collageName);
	System.out.println();	
}

public static void main(String args[])
{
	StaticBlock s=new StaticBlock();
	s.displayInfo(4952,"Mohith",collageName);
	s.displayInfo(5867,"Alfiya",collageName);
	s.displayInfo(6245,"Diwakar",collageName);
	s.displayInfo(8291,"Roshith",collageName);
}
}
