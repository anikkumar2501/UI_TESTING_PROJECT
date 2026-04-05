package utility;

import java.io.*;
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


        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println(bufferedReader.readLine());
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
        String filePath = System.getProperty("user.dir") + "/data/user.csv";
        createCsvFile(filePath);
        readCsvFile(filePath);
    }

}
