package Array_List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentIterator {
	public static boolean isBelowForty(double perc) {
		return perc < 40;
	}
	public static void main(String[] args) {
		ArrayList<Student>st = new ArrayList<Student>();
		
		st.add(new Student(1,"Poulami",99.0));
		st.add(new Student(2,"Soumyojit",98.0));
		st.add(new Student(3,"Arya",20.0));
		st.add(new Student(4,"Anubhob",96.0));
		
//		Iterator<Student> itr = st.iterator();
//		while(itr.hasNext()) {
//			itr.next().display();
//		}
		
		System.out.println("=================================");
		
		ListIterator<Student> itr2 = st.listIterator();
		while(itr2.hasNext()) {
			Student s = itr2.next();
            if (isBelowForty(s.perc)) {
                s.display();
            }
			
		}
	}
}