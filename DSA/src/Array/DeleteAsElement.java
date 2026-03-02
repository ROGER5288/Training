package Array;

public class DeleteAsElement {
	public static int[] DeleteElement(int [] arr, int element) {
		int arr2[] = new int [arr.length];
		
		for(int i = 0, j= 0; i<arr2.length;i++) {
			if(arr[i]!=element) {
				arr2[j++] = arr[i];
			}
		}
		
		for(int i = 0; i<arr2.length-1;i++) {
			System.out.println(arr2[i]);
		}
		
		return arr2;
		
	}
	public static void main(String[] args) {
				
		int arr[] = {10,30,8,3,7,2};
		
		
		int element = 30;
		
		DeleteElement(arr, element);
		
	}
}
