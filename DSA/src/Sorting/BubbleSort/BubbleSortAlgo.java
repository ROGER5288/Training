package Sorting.BubbleSort;

public class BubbleSortAlgo {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		
		Sort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] Sort(int [] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
