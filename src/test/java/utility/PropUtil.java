package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {

    public static void createAndSetPropValue(String filePath) throws IOException {

        Properties properties = new Properties();

        properties.setProperty("name", "anik");
        properties.setProperty("designation", "engineer");
        properties.setProperty("email", "abc.@gmail.com");

        FileOutputStream file = new FileOutputStream(filePath);

        properties.store(file, "this is user properties.......");

        file.close();
        System.out.println("properties file created......");

    }

    public static Object readPropFile(String filePath, String propKey) throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(filePath);
        try {
            properties.load(file);
            return properties.get(propKey);
        } finally {
            file.close();
        }

    }

    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\data\\user.properties";

//        createAndSetPropValue(filePath);

        String propKey = "name";
        Object nameValue = readPropFile(filePath, propKey);
        System.out.println(" Prop value of key " + propKey + " is " + nameValue);
    }
}
