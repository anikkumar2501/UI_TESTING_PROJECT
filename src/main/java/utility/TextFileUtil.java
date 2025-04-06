package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileUtil {

    public static void createTextFile(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        for(int i =0; i < 100; i ++) {
            fileWriter.write(" created tetx file.........\n");
            fileWriter.write(" created text file.........\n");
        }
        fileWriter.flush();
        fileWriter.close();
        System.out.println("Text file has been created at location "+filePath);

    }

    public static void readTextFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine() +"\n");
        }
    }

    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+"\\data\\user.text";
        createTextFile(filePath);
        readTextFile(filePath);
    }
}
