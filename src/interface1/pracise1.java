package interface1;
// public interface interface name(bank) 
interface bank{
	void rate();              // by default consider public abstract void rate ();
	void rate1();             //by default consider public abstract void rate1 ();
	
}
 interface bank1{ 
	 
	 void rate2(); // it is method and method name
 }


public class pracise1 implements bank,bank1 {
	
	public void rate() {
		System.out.println("HDFC BANK CROP LOAN -RATE OF INTREST 12%");
	}
	
	
	public void rate1() {
		System.out.println("HDFC BANK HOME LOAN - RATE OF INTREST 14%");
	}
	public void rate2() {
		System.out.println("CANERA BANK LOAN -RATE OF INTREST 11.5% ");
	}

	public static void main(String[] args) {
		
		 bank HDFC =new pracise1();// here we give reference of interface like bank
		  HDFC.rate();// by using this reference we called only that interface methods
		  HDFC.rate1();
          
		  bank1 CANERA =new pracise1();
		  
		        CANERA.rate2();
	}}
	// if we created object of child class without reference name then object called both interface
// like pracise1 obj =new pracise1 (); then obj called both interface methods