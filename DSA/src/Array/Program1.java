package Array;

import java.util.Arrays;

public class Program1 {
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {10,30,8,3,7,2};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
