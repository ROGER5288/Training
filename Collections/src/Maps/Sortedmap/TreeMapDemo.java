package Maps.Sortedmap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

//		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyIntegerComp());
		tm.put(3, "India");
		tm.put(1, "USA");
		tm.put(5, "China");
		tm.put(1, "India");
		tm.put(4, "Brazil");

		System.out.println(tm);

		System.out.println("================================");

		// ASCENDING order using Comparator
		TreeMap<Person, String> tm2 = new TreeMap<Person, String>(
			(p1, p2) -> Integer.compare(p1.id, p2.id)
		);

		Person p1 = new Person(1, "Anmol", 30);
		Person p2 = new Person(2, "Rahul", 30);
		Person p3 = new Person(3, "Ram", 35);
		Person p4 = new Person(1, "Anmol", 30);

		tm2.put(p1, "Maharashtra");
		tm2.put(p2, "Delhi");
		tm2.put(p3, "Bengal");
		tm2.put(p4, "MP");

		System.out.println(tm2);
	}
}
