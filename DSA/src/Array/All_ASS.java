package Array;

public class All_ASS {

    // Remove duplicates from a SORTED array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index; // new size
    }

    // Array Traversal
    public static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Search an element (Linear Search)
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Find Largest and Smallest element
    public static void largestSmallest(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }

    // Reverse an array
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] sortedArr = {1,1,2,2,3,3,4,5,5};
        int[] arr = {10, 5, 20, 8, 15};

        // Remove duplicates
        int newLen = removeDuplicates(sortedArr);
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < newLen; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();

        // Traversal
        System.out.print("Traversal: ");
        traverse(arr);

        // Search
        int key = 20;
        int index = search(arr, key);
        System.out.println(key + " found at index: " + index);

        // Largest & Smallest
        largestSmallest(arr);

        // Reverse
        reverse(arr);
        System.out.print("Reversed Array: ");
        traverse(arr);
    }
}
