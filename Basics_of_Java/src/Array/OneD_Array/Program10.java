package Array.OneD_Array;

public class Program10 {
	public static void main(String[] args) {
		
		int[] res = demo();
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	
	public static int[] demo() {
		int []a = new int[5];
		a[0] =1;
		a[1]=2;
		a[2]=3;
		return a;
	}
}
