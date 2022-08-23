package polymorphism;
// different class(a1& override) same method and same argument achieved overide polymerphism
class a1{
	
	public void m1(int a,int b) {
		
		System.out.println("hii rahul");
		
	}
	
	public static void main(String[]args) {
		a1 obj=new a1();
		obj.m1(1232, 8698);
		
	}
}




public class override_a2 extends a1 {
	public void m1(int a,int b) {
		System.out.println("hello rahul");
	}
	
	

	public static void main(String[] args) {
		override_a2 obj1=new override_a2();
		obj1.m1(123, 8698);
		
	}

}
