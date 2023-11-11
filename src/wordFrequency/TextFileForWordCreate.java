package wordFrequency;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileForWordCreate {
    public static void main(String[] args) {
        try {
            File file = new File("words.txt");

            if (file.createNewFile()) {
                System.out.println("File created");
                FileWriter fw = new FileWriter(file, true);

                fw.write("the day is sunny the the\n");
                fw.write("the sunny is is\n");

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
