package Assignment.Assignment1;

public class Program1 {
	public static void main(String[] args) {
        int num = 9;
        int s = num * num;
        int sum = 0;
        while(s>0){
            sum = s%10 + sum;
            s/=10;
        }
        if(sum==num){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not a Neon number");
        }
        
    }
}
