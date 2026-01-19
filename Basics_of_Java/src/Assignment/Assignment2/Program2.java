package Assignment.Assignment2;

public class Program2 {
	public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,0,1};
        int countOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                countOne++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < countOne)
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
