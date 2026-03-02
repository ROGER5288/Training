package Array_List.Traverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_Remove {
	public static void main(String [] args) {
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		/*
		// for each -> traverse + remove
		for(String s : languages) {
			if(s.equals("Python")) {
				languages.remove(s);
			}
		}
		*/
		
		System.out.println("==========================");
		
//		System.out.println(languages);
//		Iterator<String> itr = languages.iterator();
//		while(itr.hasNext()) {
//
//		if(itr.next().equals("Python")) {
//		itr.remove();
//
//		
//
//		}
//
//		System.out.println(languages);
//
//		}
		
		
		// List iterator
		
		// listiterator ----> traverse + remove (possible)
		
		ListIterator<String> itr2 = languages.listIterator();
		
		System.out.println(languages);
		while(itr2.hasNext()) {
			if(itr2.next().equals("Python")) {
				itr2.remove();
			}
		}
		System.out.println(languages);
	}
}
