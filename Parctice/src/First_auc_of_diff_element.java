
public class First_auc_of_diff_element {
	
	public class Heap_element_frequency {

	}

	public static void main(String[] args) {
		
		int [] arr = {0,0,0,0,1,1,1,1};
		int [] arr1 = {0,0,1,1,1,1};
		int [] arr2 = {0,0,0,0,0,0,0};
		int [] arr3 = {0,0,0,0,0,0,0,1};
//		int [] arr4 = {0,0,1,0,0,1,1,1,1};
		int [] arr4 = {0,0,0,0,0,1,1,1,1};
		System.out.println("First occurrence of new element : "+check(arr));
		System.out.println("First occurrence of new element : "+check(arr1));
		System.out.println("First occurrence of new element : "+check(arr2));
		System.out.println("First occurrence of new element : "+check(arr3));
		System.out.println("First occurrence of new element : "+check(arr4));
	}
	
//	public static int check(int [] arr) {
//		for(int i = 0; i<arr.length-1; i++) {
//			if(arr[i] != arr[i+1]) {
//				return i+1;
//			}
//		}
//		return -1;
//	}
	
	public static int check(int[] arr) {
        int left, right;

        left = 0;
        right = arr.length - 1;

        while (left < right) {
            if (left == right)
                break;

            int mid = left + (right - left) / 2;

            if (arr[mid] == 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
