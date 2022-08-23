import java.util.HashMap;
import java.util.Map;

public class mapset {

	public static void main(String[] args) {
	
		HashMap obj=new HashMap();
		
		Map obj1=new HashMap();
		
		obj1.put("surname", "dabhade");// here value is stored in obj1 
		
		obj.put("surname", "dabhade"); // here value is stored in obj
       	obj.put("mo", "869858");
		obj.put("username", "abc@123");
		
		
	//obj.clear();
	//	obj.remove("mo");
		System.out.println(obj.equals(obj1));
		
		System.out.println(obj.get("surname"));
		System.out.println(obj.get("mo"));

	}

}
