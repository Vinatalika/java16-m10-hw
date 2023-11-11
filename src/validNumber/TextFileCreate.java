package validNumber;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

// create file.txt for homework
public class TextFileCreate {

    public static void main(String[] args) {
        try {
            File file = new File("file.txt");

            if (file.createNewFile()) {
                System.out.println("File created");
                FileWriter fw = new FileWriter(file, true);

                fw.write("987-123-4567\n");
                fw.write("123 456 7890\n");
                fw.write("(123) 456-7890\n");

                fw.flush();
                fw.close();
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
