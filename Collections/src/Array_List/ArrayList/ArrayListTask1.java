package Array_List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(100);
		list.add(100.50);
		list.add("Hello");
		list.add(true);
		list.add("World");
		
		//remove --> Hello & World using iterator
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {

			if(itr.next().equals("Hello") || itr.next().equals("World")) {
			itr.remove();
			}
		}
		System.out.println(list);
		
		
		
//		ListIterator itr1 = list.listIterator();
//		
//		while(itr1.hasNext()) {
//			if(itr1.next().equals("Hello")) {
//				itr1.remove();
//			}
//		}
//		ListIterator itr2 = list.listIterator();
//
//		while(itr2.hasNext()) {
//			if(itr2.next().equals("World")) {
//				itr2.remove();
//			}
//		}
//		System.out.println(list);
	}
}
