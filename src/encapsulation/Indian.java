package encapsulation;

public class Indian {

	public static void main(String args[]) 
	{
		Bank  b=new Bank ();
		int locker =b.getLocker();
		System.out.println(locker);
		b.setLocker(3000);
		int locker2 =b.getLocker();
		System.out.println(locker2);
		
		System.out.println();
		
		int lockerAmt =b.getLockerAmt();
		System.out.println(lockerAmt);
		b.setLockerAmt(2000);
		int lockerAmt2 =b.getLockerAmt();
		System.out.println(lockerAmt2);
		
		System.out.println();
		
		String phone=b.getPhone();
		System.out.println(phone);
		b.setPhone("oneplus8t");
		String phone2=b.getPhone();
		System.out.println(phone2);
	}
}
