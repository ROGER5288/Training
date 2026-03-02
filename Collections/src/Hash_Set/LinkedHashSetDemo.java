package Hash_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
				
		lhs.add(100);
		lhs.add(10);
		lhs.add(50);
		lhs.add(70);

		System.out.println(lhs);
		// iterate here using foreach, Iterator, ListIterator
		
		for(Integer i: lhs) {
			System.out.println(i);
		}
		
		System.out.println("=================================");
		
		Iterator itr1 = lhs.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("=================================");

		//  Using ListIterator (Convert Set → List)
		System.out.println("Using ListIterator:");
		ArrayList<Integer> list = new ArrayList<Integer>(lhs);

		ListIterator<Integer> litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("=================================");

		// Backward traversal using ListIterator
		System.out.println("Backward using ListIterator:");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
