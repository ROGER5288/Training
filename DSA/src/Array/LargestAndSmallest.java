package Array;

public class LargestAndSmallest {
	public static int Largest(int arr[]){
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int Smallest(int arr[]) {
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10,30,8,3,7,2};
		
		int max = Largest(arr);
		int min = Smallest(arr);
		
		System.out.println("Largest is : " + max);
		
		System.out.println("Smallest is : " + min);
		
	}
}
