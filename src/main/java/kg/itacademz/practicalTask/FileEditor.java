package kg.itacademz.practicalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileEditor {
    private final static String pathToFile = "src/main/resources/counter.txt";

    public static void increment(){
        try {
            File myObj = new File(pathToFile);
            FileWriter myWriter = new FileWriter(myObj, false); // true to append
            String data = "";
            Path filePath = Paths.get(pathToFile);
            try {
                data = Files.lines(filePath).findFirst().get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int counter = Integer.parseInt(data);
            System.out.println(counter);
            myWriter.write(String.valueOf(counter+1));
            myWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCount(){
        Path filePath = Paths.get(pathToFile);
        try {
            String firstLine = Files.lines(filePath).findFirst().get();
            System.out.println(firstLine);
            return firstLine;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}