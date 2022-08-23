import java.util.ArrayList;
import java.util.List;

public class Arraylist  {

	public static void main(String[] args) {
		
		List obj=new ArrayList();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add("rahul");
	
  //obj.clear(); this method used to clear all the values which can we stored in obj.
		
	//	System.out.println(obj);
	//	System.out.println(obj.get(1));
	//	System.out.println(obj.get(4));
		
		
		
		int j = obj.size()-1;
		
     for(int i=0;i<=j;i++) {
    	 
    	 System.out.println(obj.get(i));
    	 
     }
		
		
	}

}
