package FileHandling_Thread_merged;

public class Task_Main_Synchronized {
    public static void main(String[] args) {

        Task1 task = new Task1();

        Thread th1 = new Thread(() -> {
            try {
                task.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread th2 = new Thread(() -> {
            try {
                task.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        th1.start();
        th2.start();
    }
}

class Task1 {
    public synchronized void countDown() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " Count: " + i);
            System.out.println(" Count: " + i);
            Thread.sleep(1000);
        }
    }
}