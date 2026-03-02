package Search.LinearSearch;

public class LinearSearchAlgo {
	public static void main(String[] args) {
		int arr[] = {10,20,30,6,50,4,90};
		
		int n = 90;
		int result = isfound(arr, n);
		if(result==-1) {
			System.out.println("The no is present not in the array");
		}else {
			System.out.println("The no is  present in the array in the index : " + result);

		}
	}
	
	public static int isfound(int[] arr, int n) {
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
