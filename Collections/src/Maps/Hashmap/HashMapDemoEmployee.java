package Maps.Hashmap;

import java.util.HashMap;

public class HashMapDemoEmployee {	
	public static void main(String[] args) {
		HashMap<Employee, String> hm = new HashMap<Employee, String>();

		Employee e1 = new Employee(1, "Rohit", 30000);
		Employee e2 = new Employee(1, "Rohit", 30000);

		hm.put(e1, "Hr");
		System.out.println(hm);
		hm.put(e2, "Developer");
		
		System.out.println(hm);
	}
}
