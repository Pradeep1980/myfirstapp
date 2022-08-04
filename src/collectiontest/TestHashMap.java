package collectiontest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	
	public static void main(String[] args) {
		Employee e= new Employee(101," Deepak");
		Employee e1= new Employee(102," Deepak");
		Employee e2= new Employee(103," Deepak");
		
		Map map= new HashMap<>();
		map.put(e, "shyam");
		map.put(e1, "Deepak");
		map.put(e2, "Pradeep");
		

 System.out.println(map);
		
		
	}
	
	
}
