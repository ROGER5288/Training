package FileHandling_Thread_merged;


public class Task_Main_Join {
    public static void main(String[] args) {

        Task2 task = new Task2();

        Thread th1 = new Thread(() -> {
            try {
                task.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"TH_1"); // naming a thread

        Thread th2 = new Thread(() -> {
            try {
            	th1.join();
                task.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"TH_2"); // naming a thread

        th1.start();
        th2.start();
    }
}

class Task2 {
    public void countDown() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Count: " + i);
//            System.out.println(" Count: " + i);
            Thread.sleep(1000);
        }
    }
}
