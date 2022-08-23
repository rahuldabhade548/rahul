package interface1;

 public class a3 implements  a1,a2 {
	public void rate() {
		System.out.println("HDFC BANK RATE OF INTREST 12%");
	}
	
	public void rate1() {
		System.out.println("ICICI BANK RATE OF INTREST 14%");
	}

	public static void main(String[] args) {
		a3 HDFC=new a3();
		
	       HDFC.rate();
	       
		
		a3 ICICI=new a3();
		
		   ICICI.rate1();
		
		
	}

}
