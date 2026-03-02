package FileHandling_Thread_merged;

class Task{
	public void countDown() throws InterruptedException {
		for(int i=0; i<=5; i++){
			System.out.println("Count: " + i);
			Thread.sleep(1000);// Instead of wait and notify we can use sleep
		}
	}
}

public class Task_Main {
	public static void main(String[] args) {
		Task t1 = new Task();
		Task t2 = new Task();
		Thread th1 = new Thread(() ->{
			try{
				t1.countDown();
//				t1.wait();
//				t1.notify();

			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		});
		
		Thread th2 = new Thread(() ->{
			try{
				t2.countDown();
//				t2.wait();
//				t2.notify();
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		});
		
		th1.start();
        th2.start();


	}
}
