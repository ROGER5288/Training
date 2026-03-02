//File - represents a file or folder 
//FileWriter - write text to file
//FileReader - read text from file
//BufferReaded - fast reading
//BufferWriter - fast writing

package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create_New_File {

    public static void main(String[] args) {

        try {

            // Create file in project folder
            File file = new File("src/TestFile.txt");
            System.out.println("File object created");
            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            // Write into file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello");
            writer.close();

            System.out.println("Writing Completed");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

