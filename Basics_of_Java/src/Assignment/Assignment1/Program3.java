package Assignment.Assignment1;

public class Program3 {
	public static void main(String[] args) {
        int num = 5;
        int s = num*num;
        int temp1 = num;
        int temp2 = s;
        boolean isautomorphic = true;
        while(temp1!=0){
            if(temp1%10 != temp2%10){
                
                isautomorphic = false;
                break;
            }
            temp1/=10;
            temp2/=10;
        }
        if(isautomorphic){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not");
        }
    }
}
