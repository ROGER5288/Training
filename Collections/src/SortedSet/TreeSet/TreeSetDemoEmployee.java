package SortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSetDemoEmployee {
	public static void main(String[] args) {
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		
		Employee p1 = new Employee(3, "Rohit", 70000);
		Employee p2 = new Employee(1, "Shyam", 30000);
		Employee p3 = new Employee(2, "Virat", 30000);
		Employee p4 = new Employee(4, "Hari", 40000);
		Employee p5 = new Employee(5, "Hari", 40000);
		Employee p6 = new Employee(4, "Hari", 40000);
		
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		ts.add(p6);


		System.out.println(ts);
		
	}
}
