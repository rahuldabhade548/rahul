package interface1;

interface k1 {
	void m1();
	
}

interface k2{
	void m2();
	
}

public class k3 implements k1,k2{
	
	public void m1() {
		System.out.println("SBI BANK RATE OF INTREST 14%");
	}
	
	public void m2() {
		System.out.println("CANERA BANK RATE OF INTREST IS 12%");
	}
	

	
	
	public static void main(String[] args) {
       
		  k1 SBI=new k3();
	      SBI.m1();
	     
	 
		
          k2 CANERA=new k3();
      
           CANERA.m2();
	}

}
