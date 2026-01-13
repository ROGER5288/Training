package Assignment.Assignment1;

public class Program2 {
	public static void main(String[] args) {
        int num = 6;
        int temp = num;
        int count = 0;
        while(temp!= 0){
            int r = temp%2;
            temp/=2;
            if(r==1){
                count++;
            }
        }
        if(count>=2){
            System.out.println("Evil Number");
        }else{
            System.out.println("Not ");
        }
        
    }
}
