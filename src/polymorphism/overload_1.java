package polymorphism;

public class overload_1 {
	
	public void m1(str use,int pass) {
		System.out.println(" hello m1");
	}
	public void m1(int b,int c) {
		System.out.println("hello m1");
	}
	
	public void m1(int c) {
		
		System.out.println("hello m1");
	}
	
	

	public static void main(str[] args) {
		overload_1 obj=new overload_1();
		
		obj.m1("rahul",8698);
		obj.m1(20,30);
		obj.m1(30);

	}

}
