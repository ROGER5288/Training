package OOP.Inheritance;

//class WhiteTiger extends Tiger {
//
//    public void whiteColor() {
//        System.out.println("White in color");
//    }
//}


public class WhiteTiger extends Tiger{

	public void Whitecolor() {
		System.out.println("White in Colour");
	}
	public static void main(String[] args) {
		WhiteTiger wt=new WhiteTiger();
		wt.Whitecolor();
		wt.roar();
		wt.walk();
		
		Tiger tiger=wt;
		
		tiger.roar();
		tiger.walk();
		((WhiteTiger)tiger).Whitecolor();
		
		Animal animal=wt;
		
		animal.walk();
		((Tiger)animal).roar();
		((WhiteTiger)animal).Whitecolor();
		
	}
	
}