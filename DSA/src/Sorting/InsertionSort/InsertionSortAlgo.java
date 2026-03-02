package Sorting.InsertionSort;

public class InsertionSortAlgo {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		
		Sort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] Sort(int [] arr) {
		
		
		for(int i = 1; i<arr.length;++i) {
			
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j-=1;
			}
			arr[j+1] = key;
			
		}
		return arr;
	}
}
