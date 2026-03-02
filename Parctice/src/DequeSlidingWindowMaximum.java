import java.util.*;

public class DequeSlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] arr, int k) {

        if (arr == null || arr.length == 0) return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Start storing result after first k elements
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,3,4,5,6,2,5,9,7,2};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}
