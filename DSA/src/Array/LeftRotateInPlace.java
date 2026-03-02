package Array;
import java.util.Arrays;

public class LeftRotateInPlace {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 2;
        int n = arr.length;

        key = key % n; // handle large key

        reverse(arr, 0, key - 1);
        reverse(arr, key, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}
