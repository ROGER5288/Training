package Array;

public class Insert_into_Sorted_Array{
	public static int[] InsertE(int []arr,int element) {
		int arr2[] = new int [arr.length + 1];
		int pos =0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[0]>element) {
				pos=0;
			}else if(arr[i]<element) {
				pos++;
			}
		}
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
		int arr[] = {101,105,110,120,130};
		
		int element = 107;
		
		InsertE(arr, element);
		
	}
}
