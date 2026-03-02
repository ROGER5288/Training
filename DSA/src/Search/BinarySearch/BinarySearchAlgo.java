package Search.BinarySearch;

public class BinarySearchAlgo {
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int n = 4;
		
		int result = isfound(arr, n);
		
		if(result ==-1) {
			System.out.println("The element is not in the array");
		}else {
			System.out.println("The element is present in the index : " + result);
		}
	}
	
	public static int isfound(int arr[], int n) {
		
		int low = 0;
		int high = arr.length -1;
		
		while(low <= high) {
			
			int mid = low + (high -low) /2;
			
			System.out.println(mid);
			
			if(arr[mid] == n) {
				return mid;
			}else if(arr[mid]>n) {
				high = mid-1;
			}else if(arr[mid]<n) {
				low = mid+1;
			}
			
		}
		return -1;
	}
	
}
