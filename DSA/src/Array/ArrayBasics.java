package Array;

public class ArrayBasics {

    // 1. Print array
    static void print(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    // 2. Sum
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    // 3. Average
    static double avg(int[] a) {
        return (double)sum(a) / a.length;
    }

    // 4. Count even and odd
    static void evenOdd(int[] a) {
        int e = 0, o = 0;
        for (int x : a)
            if (x % 2 == 0) e++; else o++;
        System.out.println("Even: " + e + " Odd: " + o);
    }

    // 5. Linear search
    static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

    // 6. Second largest
    static int secondLargest(int[] a) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max)
                second = x;
        }
        return second;
    }

    // 7. Reverse in place
    static void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++; j--;
        }
    }

    // 8. Check sorted
    static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1]) return false;
        return true;
    }

    // 9. Copy array
    static int[] copy(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        return b;
    }

    // 10. Count duplicates
    static void countDuplicates(int[] a) {
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1)
                System.out.println(a[i] + " occurs " + count + " times");
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 8, 2, 4, 9};

        print(a);
        System.out.println("Sum: " + sum(a));
        System.out.println("Avg: " + avg(a));
        evenOdd(a);
        System.out.println("Index: " + search(a, 8));
        System.out.println("Second Largest: " + secondLargest(a));
        reverse(a);
        print(a);
        System.out.println("Sorted: " + isSorted(a));
        print(copy(a));
        countDuplicates(a);
    }
}
