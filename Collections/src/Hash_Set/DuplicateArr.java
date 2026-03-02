package Hash_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateArr {
	public static List<Integer> checkDuplicate(ArrayList<Integer> ar){
		List<Integer> in = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (Integer integer : ar) {
			if(hs.contains(integer)) {
				in.add(integer);
			}else {
				hs.add(integer);
			}
		}
		
		return in;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(10);
		ar.add(20);
		ar.add(40);
		ar.add(50);
		
		List<Integer> in = checkDuplicate(ar);
		for (Integer integer : in) {
			System.out.print(integer+" ");
		}
		
	}
}