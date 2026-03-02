package FileHandling_Thread_merged;
//Do not run this code
//Do not run this code
//Do not run this code
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Do not run this code
class FileTask implements Runnable {
	//Do not run this code
    private int fileNumber;
  //Do not run this code
    public FileTask(int fileNumber) {
        this.fileNumber = fileNumber;
    }
  //Do not run this code
    @Override
    public void run() {
        try {
            File folder = new File("src/GeneratedFiles");
            if (!folder.exists()) {
                folder.mkdir();
            }
          //Do not run this code
            File file = new File(folder, "file" + fileNumber + ".txt");
          //Do not run this code
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                writer.write("Hello from file" + fileNumber);
                writer.close();
              //Do not run this code
                System.out.println("Written: file" + fileNumber);
            }
          //Do not run this code
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Do not run this code
public class Create_10k_Files {
	//Do not run this code
    public static void main(String[] args) {
    	//Do not run this code
        // Fixed thread pool (10 threads running simultaneously)
        ExecutorService executor = Executors.newFixedThreadPool(10);
      //Do not run this code    
        
      //Do not run this code
        for (int i = 1; i <= 10000; i++) {
            executor.execute(new FileTask(i));
        }
      //Do not run this code
        executor.shutdown();
      //Do not run this code
        System.out.println("All tasks submitted...");
    }
}
