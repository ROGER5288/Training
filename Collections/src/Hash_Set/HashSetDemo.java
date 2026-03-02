package Hash_Set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String [] args) {
		
		//HashSet<Ineteger> hs = new HashSet<Integer>();
//		hs.add(10);
//		hs.add(30);
//		hs.add(2);
//		hs.add(40);
//		hs.add(2);
//		hs.add(100);
//		System.out.println(hs);
//
//		Integer i1 = 10;
//		Integer i2 = 20;
//		Integer i3 = 10;
//		System.out.println(i1.hashCode());
//		System.out.println(i2.hashCode());
//		System.out.println(i3.hashCode());
//		System.out.println(il.equals(i2));
//		System.out.println(il.equals(i3));

		HashSet<Employee> hs = new HashSet<Employee>();

		Employee e1= new Employee(1, "Rohit", 30, "rohit@gmail.com");
		Employee e2= new Employee(1, "Rohit", 35, "rohit@gmail.com");
		Employee e3= new Employee(2, "Rohit", 50, "rohit@gmail.com");

		
//		Employee e1= new Employee(1, "Rohit", 20000);
//		Employee e2= new Employee(1, "Rohit", 35000);
//		Employee e3= new Employee(2, "Rohit", 50000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);

	
		System.out.println(hs);
	}
}
