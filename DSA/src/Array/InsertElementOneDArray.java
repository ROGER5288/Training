package Array;

public class InsertElementOneDArray {
	
	public static int[] InsertElement(int [] arr, int pos, int element) {
		int arr2[] = new int [arr.length+1];
		
		for(int i = 0, j= 0; i<arr2.length;i++) {
			if(i==pos) {
				arr2[i]=element;
			}else {
				arr2[i] = arr[j++];
			}
		}
		
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		return arr2;
		
	}
	public static void main(String[] args) {
				
		int arr[] = {10,30,8,3,7,2};
		
		int pos = 3;
		
		int element = 99;
		
		InsertElement(arr,  pos,  element);
		
	}
}


//int arr[] = {10,30,8,3,7,2};
//int pos = 3;
//
//int arr2[] = new int [arr.length+1];
//
//for(int i = 0, j= 0; i<arr2.length;i++) {
//	if(i==pos) {
//		arr2[i]=99;
//	}else {
//		arr2[i] = arr[j++];
//	}
//}
//
//for(int i = 0; i<arr2.length;i++) {
//	System.out.println(arr2[i]);
//}
