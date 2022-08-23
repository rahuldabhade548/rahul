package polymorphism;

public class compile_methodoverloading {
	//achieve by same method name in same class but different argument like types,no.,sequence
	
	public void m1(int mo,int pass) {
		
		System.out.println("login succefully");
		
	}
	public void m1(int mo) {
		System.out.println("login succefully");
	}
	public void m1(str email,int pass) {
		
		System.out.println("login succefully");
		

	}
      public void m1(int mo,str email) {
		
		System.out.println("login succefully");
		
      }
	
	
	
	

	public static void main(str[] args) {
	
		compile_methodoverloading obj=new compile_methodoverloading();
		obj.m1(869858, 1232);
		obj.m1(869858);
		obj.m1("abc", 1232);
		obj.m1(869858, "abc");
		
	}
}

