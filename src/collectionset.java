import java.util.HashSet;
import java.util.Set;

public class collectionset {

	public static void main(String[] args) {
		
		//not allow duplicate value
		//it can not handle by index means not print serially.
		
		HashSet obj=new HashSet();
		Set obj1=new HashSet();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add('c');
		obj.add("rahul");
		obj.add(10);//here it can not allow or print duplicate value
		
//obj.remove(20); by using this method we remove the value from print.
//obj.remove(10); by this 10 value cannot print when if we add it more than ones.
//because here only take value one time bcz cannot take duplicate.	
		System.out.println(obj);
		
		
		
		
		
	}

}
