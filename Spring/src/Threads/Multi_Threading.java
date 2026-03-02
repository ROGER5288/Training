package Threads;


class Logic extends Thread{
	
	int ThreadNumber;
	Logic(int ThreadNumber) {
		this.ThreadNumber =ThreadNumber;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=5;i++) {
			System.out.println(i + "The Thread Number is : " + ThreadNumber);
			
			if(ThreadNumber ==3) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class Multi_Threading{
	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			Logic th = new Logic(i);
			th.start();
		}
		
//		Logic t1=new Logic(); //logic is the class name which is being called 
//		Logic t2=new Logic();
//		
//		t1.start();
//		t2.start();
//		
//		
//		t1.run();
//		t2.run();
		
		
	}
}