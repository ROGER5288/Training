package Array_List;

import java.util.ArrayList;

//Adds all elements from another collection.
public class AddAllMethod {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Mango");
		list1.add("Banana"); 
		list1.add("Apple");
		//list1.add(100); CTE
		System.out.println(list1);
		
		
		ArrayList list2 = new ArrayList();
		list2.add(101);
		list2.add("Hello");
		list2.add('a');
		list2.add(true);
		list2.add(100.50);
		System.out.println(list2);
	}	
}
