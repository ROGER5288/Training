package Threads;

//Life cycle states
/* 6 states :
 * New - Runnable - blocked - waiting - timed waiting - terminated
 * 
 * ===========
 * Flow :
 * New - Runnable - running - (waiting / blocked / timed waiting) - running - terminated
 * 
 * 
 * */


public class Thread_Ex_Worker_program1 {

    static final Object lock = new Object();

    public static void main(String[] args) throws Exception {

        Thread worker = new Thread(
        		() -> {
        			try {
        				System.out.println("Worker : Started");
        				Thread.sleep(2000);
        				synchronized (lock) {
        					System.out.println("Worker: going to waiting state");
        					lock.wait();
        				}
        				System.out.println("Worker: Resumed and finishing");
        			}catch(InterruptedException e){
        				throw new RuntimeException(e);
        			}
        		}
        		);
        
        System.out.println("State after Creation : " + worker.getState());
        worker.start();
        Thread.sleep(100);
        System.out.println("State after starting : " + worker.getState());
        
        Thread.sleep(500);
        System.out.println("State during sleep: " + worker.getState());
        
        Thread.sleep(2000);
        System.out.println("State during wait() : " + worker.getState());
        
        synchronized (lock) {
        	lock.notify();
        }
        
        worker.join(); // join with other threads 
        System.out.println("State after complete : " + worker.getState());
        
    }
}





