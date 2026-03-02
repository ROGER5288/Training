package Array;

public class SecondlargestSmallest {
	public static void Largest(int arr[]){
		int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max2 = max;
				max = arr[i];
			}else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
		}
		System.out.println("Largest is : " + max);
		System.out.println("Second Largest is : " + max2);
	}
	
	public static void Smallest(int arr[]) {
		int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(min>arr[i]) {
				min2 = min;
				min = arr[i];
			}else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
            }
		}
		System.out.println("Smallest is : " + min);
		System.out.println("Second Smallest is : " + min2);
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10,30,8,3,7,2};
	
		Largest(arr);
		Smallest(arr);
		
	}
}
