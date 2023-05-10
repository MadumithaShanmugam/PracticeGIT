package encapsulation;

public class Bank {
 private int locker =7000;
 private int lockerAmt  =5000;
 private String phone="iphone";
 
 public int getLocker()
 {
	 return locker;
 }
 public void setLocker(int locker)
 {
	 this.locker=locker;
 }
 public int getLockerAmt()
 {
	 return lockerAmt;
 }
 public void setLockerAmt(int lockerAmt)
 {
	 this.lockerAmt=lockerAmt;
 }
 public String getPhone()
 {
	 return phone;
 }
 public void setPhone(String Phone)
 {
	 this.phone= Phone;
 }
}
