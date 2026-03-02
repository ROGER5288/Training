package Sorting.SelectionSort;

public class SelectionSortAlgo {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,3};
		
		Sort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] Sort(int [] arr) {
		for(int i = 0; i< arr.length-1;i++) {
			
			int min_index = i;
			
			for(int j = i+1; j<arr.length;j++) {
				if(arr[min_index] >arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}

}
