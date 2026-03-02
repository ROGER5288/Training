package Assignment.ASS3;
public class RotateArray{
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int pos = 3;

		pos = pos % arr.length;

		int[] newArr = new int[arr.length];

		for (int i = arr.length - pos, p = 0; i < arr.length; i++, p++) {
			newArr[p] = arr[i];
		}

		for (int i = pos, p = 0; i < arr.length; i++, p++) {
			newArr[i] = arr[p];
		}

		for (int i : newArr) {
			System.out.println(i);
		}

	}
}