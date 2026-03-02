package Lambda_Function.Com;

public class Main {
	public static void main(String[] args) {
		
//		Demo demo = new DemoImpl();
//		
//		demo.sample();
		
		/*if the method is not an argument method and not a return type method in the 
		 * functional interface*/
		
//		Demo demo = ()->{
//			System.out.println("Method implemented by Using Lambda Expression");
//		};
//		demo.sample();
//		
//		Demo demo1 = ()->
//				System.out.println("Method implemented by Using Lambda Expression");
//		demo1.sample();
		
		
		
		/*if the method is single argument method and single statement is provided for the method*/
//		Demo demo = (num)->{
//			System.out.println("For Argument method");
//		};
//		demo.sample(1000);
//		
//		
//		Demo demo1 = (num)-> System.out.println("For Argument method");
//		demo1.sample(1232);
		
		
//		Demo demo = (a,b)->{
//			System.out.println(a+b);
//		};
//		demo.sample(51, 49);
//		
//		Demo demo1 = (a,b)->{
//			System.out.println(a>b?a:b);
//		};
//		demo1.sample(51, 49);
//		Demo demo2 = (a,b)->{
//			System.out.println("For two argument method");
//		};
//		demo2.sample(65,654);
		
		
		
		Demo demo = (a, b)->{
			return a+b;
		};
			
		demo.sample(64, 36);
		
		Demo demo1 = (a,b)-> a+b;
				System.out.println(demo.sample(6, 8));
		
		
		
		
	}
}
