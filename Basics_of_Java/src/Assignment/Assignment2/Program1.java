package Assignment.Assignment2;

public class Program1 {
	public static void main(String[] args) {
		int a [] = {1,2,3}; 
		for(int i = a.length-1; i>= 0; i--) {
			if(a[i]<9) {
				a[i]++;
				for (int j = 0; j < a.length; j++) {
		            System.out.print(a[j] + " ");
		        }
				return;
			}
			a[i]=0;
			
		}
		int[] result = new int[a.length+1];
		result[0] =1;
		for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
	}
}
