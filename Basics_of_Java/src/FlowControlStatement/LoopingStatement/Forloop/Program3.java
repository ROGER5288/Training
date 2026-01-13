package FlowControlStatement.LoopingStatement.Forloop;

public class Program3 {
	public static void main(String[]args) {
		for(int row = 0; row<3; row++) {
			for(int col =0;col<3;col++) {
				System.out.print("*");   
			}
			System.out.println("");
		}
		/*
		for(int i =0;i<3;i++) {
			System.out.print("*");   
			//* * *
		}
		for(int i =0;i<3;i++) {
			System.out.println("*");
			//***
			//***
		}
		for(int i =0;i<3;i++) {
			System.out.println("*");
			//***
			//***
			//***
		}
		*/
		
	}
}
