package abs;

public class a2 extends a1{
	
	public  void m1(int a) {
		System.out.println("it is body of class2 "+a);
	}
	public void mm() {
		System.out.println("it is mm method class1");
	}

	public static void main(String[] args) {

		a2 obj=new a2();
		obj.m1(10);
		obj.m2();
		obj.mm();
	}

}
