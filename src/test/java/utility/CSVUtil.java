package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVUtil {

    public static void createCsvFile(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.append("name, email, phone \n");
        fileWriter.append("anik, anik@gmail.com, 8877 \n");
        fileWriter.append("Sugu, sugu@gmail.com, 7722 \n");
        fileWriter.append("Tugu, tugu@gmail.com, 8877 \n");
        fileWriter.close();
        System.out.println("CSV file created at location " + filePath);
    }

    public static void readCsvFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String[] lineData = scanner.nextLine().split(",");
            for (String str : lineData) {
                System.out.print(str + "\t");
            }
            System.out.println("\n");
        }

    }


    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\data\\user.csv";
        createCsvFile(filePath);
        readCsvFile(filePath);
    }

}
