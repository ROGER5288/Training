package Assignment.Assignment1;

public class Program6 {
	public static void main(String[] args) {
        int i = 0;
        int num = 2025;
        int digits = 0;
        int half;
        int d;
        int temp = num;
        int f;
        int s;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        if(digits%2!=0){
            System.out.println("Not");
        }else{
            half = digits/2;
            d =1;
            while(i<half){
                d*=10;
                i++;
            }
            f = num / d;
            s = num % d;
            int sum = f + s;
            if(sum * sum == num){
                System.out.println("Tech Number");
            }else{
                System.out.println("Not");
            }
        }
    }
}
