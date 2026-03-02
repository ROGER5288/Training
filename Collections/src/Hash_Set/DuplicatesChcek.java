package Hash_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesChcek {
	public static void main(String[] args) {
	
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,40,50));		
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		for(int i : nums) {
		
			if(!hs1.add(i)) {
				hs2.add(i);
			}
		}
		
		System.out.println(hs2);
	}
}