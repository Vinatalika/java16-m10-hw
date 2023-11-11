package userJson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class TextFileForJsonCreate { public static void main(String[] args) {
    try {
        File file = new File("file2.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
            FileWriter fw = new FileWriter(file, true);

            fw.write("name age\n");
            fw.write("alice 21\n");
            fw.write("ryan 30\n");

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
