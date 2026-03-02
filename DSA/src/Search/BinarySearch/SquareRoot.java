package Search.BinarySearch;

public class SquareRoot {
	public static void main(String[] args) {
		int num = 8;
		
		int result = Sq(num);
		
		System.out.println("The answer is : " + result);
	}
	
	public static int Sq(int num) {
		
		
		int low = 1, high = num;
        int ans = 0;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid; // avoid overflow

            if(square == num)
                return mid;

            else if(square < num) {
                ans = mid;       // store possible answer
                low = mid + 1;
            }
            else
                high = mid - 1;
        }

        return ans; // floor sqrt
		
		
		
		
		
		
		
		
		
		
//		int i = 1;
//		while( i < num/i ) {
//			if(i==num/i) {
//				return i;
//			}else if(i<num/i) {
//				i++;
//			}else if(i>num/i) {
//				return i-1;
//			}
//		}
//		return i;
	}
}		
		
		
		
		
		
		 
		
		
		

