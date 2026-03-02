package Search.BinarySearch;

public class MissingValue {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };

		int result = isfound(arr);

		System.out.println("The element is  : " + result);

	}

	public static int isfound(int arr[]) {

		int low = 0;
		int high = arr.length - 1 ;
		
		
		int start = arr[0];

		while (low <= high) {

			int mid = low + (high - low) / 2;

			System.out.println(mid);

			if (arr[mid] == start + mid) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low + start;
	}
}
