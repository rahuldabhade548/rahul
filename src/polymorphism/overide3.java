package polymorphism;

class s1{
	public void add(int a,int b) {
		System.out.println("hii");
		
	}
	
	
}

public class overide3 extends s1 {
	
	public void add(int a,int b) {
		
		System.out.println("hii customer");
	}
	

	public static void main(str[] args) {
	
		overide3 obj=new overide3();
		obj.add(8698, 12320);

		
	}

}
