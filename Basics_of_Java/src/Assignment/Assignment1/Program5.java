package Assignment.Assignment1;

public class Program5 {
	public static void main(String[] args) {
        int num = 25;
        int i =0 ;
        boolean isroot = false;
        while(i<num/2){
            if(i*i == num){
                isroot= true;
                break;
            }
            i++;
        }
        if(isroot){
            System.out.println("Squareroot");
        }else{
            System.out.println("Doesn't exist");
        }
    }
}
