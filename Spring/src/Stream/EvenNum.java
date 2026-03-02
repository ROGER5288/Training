package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class EvenNum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
//		List<Integer> even = new ArrayList<>();
//		
//		for(Integer n : list) {
//			if(n%2 == 0) {
//				even.add(n);
//			}
//		}
		
		/*
		Stream sends data one by one and filter check data 
		if condition is met or not and saves temporarily 
		and toList adds it to a list
		*/
		//Flow of execution
		//Collection > Stream > Filter > Transform > Collect > Result
		List<Integer> even = list.stream()   // Source
									.filter( n -> n%2 == 0)   // Intermediate 
									.map(n -> n*2)    // Intermediate
									.toList();  // Terminal or collect
		
		System.out.println(even);
		
		
	}
}
