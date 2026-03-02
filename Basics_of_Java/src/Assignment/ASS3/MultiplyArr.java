package Assignment.ASS3;

public class MultiplyArr {
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int m = 1;
		int[] newArr = new int[a.length];
		
		for(int i = 1; i<a.length;i++) {
			m*=a[i];
		}
		for(int j = 0; j<a.length;j++) {
			System.out.println(newArr[j] = m/a[j]);
			
		}
		
		
	}
}
