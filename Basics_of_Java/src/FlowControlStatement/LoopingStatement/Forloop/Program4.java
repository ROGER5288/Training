package FlowControlStatement.LoopingStatement.Forloop;

public class Program4 {
	public static void main(String[] args) {
		for(int row =1; row <=3; row++) {
			for(int col = 1; col <=3; col++) {
				if(row==col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}
