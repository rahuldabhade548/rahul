package polymorphism;

public class Encapsulation {
	
  private int rollno=10;  //data hide it can't  access to another class or not modified.
	
	
	public void setrollno(int rollno ) {
		
		this.rollno=rollno;
		
		
	}
	
	public int getrollno() {
		
		return rollno;
	}
	
	
	
	
	public static void main (str[]arg) {
		
		Encapsulation  obj=new Encapsulation ();
		obj.setrollno(15);
		
		System.out.println(obj.getrollno());
		
		
	}




	



	
	
	
	
	
}
