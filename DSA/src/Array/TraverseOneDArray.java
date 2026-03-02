package Array;

public class TraverseOneDArray {
	public static void main(String[] args) {
		int arr[]= {10,30,8,3,7,2};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
	}
}
