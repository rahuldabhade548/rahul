import java.util.HashMap;
import java.util.Map;

public class collectionmap {

	public static void main(String[] args) {
		
		HashMap obj=new HashMap();
		
		 Map obj1=new HashMap();
 // here we store the value in the form of 'key and value'
		 obj1.put("id", 10);
		 obj1.put("username","rahul@123" );
		 obj1.put("pass", 123);
		
		 System.out.println(obj1.get("username"));
		 
		 System.out.println(obj1.get("pass"));
		 
		
		
	}

}
