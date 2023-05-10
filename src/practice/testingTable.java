package practice;

public class testingTable {
	int mind=6;
	public void checkTable()
	{
		
		for (int tab=1;tab<=10;tab++)
		{
			System.out.println(mind + "*"+ tab+"="+mind*tab);
		}
	}
	public static void main(String args[])
	{
		testingTable  t= new testingTable ();
		t.checkTable();
		}
	}

