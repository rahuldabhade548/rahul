package polymorphism;

public class e1 {
	
	private int emplyid;// data hidden or secure
	
	public void setemplyid(int emplyid) {
	this.emplyid	=emplyid;
		
		
	}
	
	public int getemplyid() {
		return emplyid;
	}
	public final void yogesh() {
		System.out.println("yogesh");
	}
	public static void rahul() {
		System.out.println("rahul");
	}
	

	public static void main(String[] args) {

	e1 obj=new e1 ();
	obj.setemplyid(10);
	
	System.out.println(obj.emplyid);
	}

}
