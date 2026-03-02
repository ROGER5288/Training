package Array;

public class LeftRotate {

	public static int[] LeftRotate(int arr[], int pos) {
		
		int n = arr.length;
		int r[] = new int [n];
		
		for(int i = 0; i<n; i++) {
			
			r[i] =arr[(i+pos)%n];
		}
		
		return r;
				
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		int pos = 3;
		
		int rotatedArr[] = LeftRotate(arr, pos);
		
		for(int i: rotatedArr) {
			System.out.println(i);
		}
	}
}
