package Sorting.QuickSort;

public class QuickSortAlgo {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		
		Sort(arr, 0, arr.length - 1);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void Sort(int [] arr, int low, int high) {
		if (low < high) {
            
            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // recursion calls for smaller elements
            // and greater or equals elements
            Sort(arr, low, pi - 1);
            Sort(arr, pi + 1, high);
        }
	}
	
	// partition function
   public  static int partition(int[] arr, int low, int high) {
        
        // choose the pivot
        int pivot = arr[high];
        
        // index of smaller element and indicates 
        // the right position of pivot found so far
        int i = low - 1;

        // traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);  
        return i + 1;
    }

    // swap function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
