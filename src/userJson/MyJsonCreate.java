package userJson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MyJsonCreate {

    public static void main(String[] args) {
        String inputFileName = "file2.txt";
        String outputFileName = "user.json";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            List<User> userList = new ArrayList<>();
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                userList.add(new User(name, age));
            }

            try (FileWriter writer = new FileWriter(outputFileName)) {
                String json = new Gson().toJson(userList);
                writer.write(json);
                System.out.println("We are create user.json:");
                System.out.println(json);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
