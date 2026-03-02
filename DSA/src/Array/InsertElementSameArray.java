package Array;

public class InsertElementSameArray {
	public static int[] InsertElement(int [] arr, int pos, int element) {
		
		for(int i = arr.length -1; i>pos;i-- ) {
			
			
			arr[i]=arr[i-1];
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
				
		int arr[] = new int[10];
		
		arr[0] = 10;
		arr[1] = 30;                           
		arr[2] = 8;
		arr[3] = 3;
		arr[4] = 7;
		arr[5] = 2;
		
		int pos = 3;
		
		int n = 6;
		
		int element = 99;
		
		System.out.println(InsertElement(arr,  pos,  element));
		
	}
}
