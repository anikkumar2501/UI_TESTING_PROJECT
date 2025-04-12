package utility;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
    }

    public static void deleteFile(String filePath) throws IOException {
        File file = new File(filePath);
        if(file.exists()){
            file.delete();
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\file");
        file.mkdir();
        String filePath = file.getAbsolutePath()+".txt";
        createFile( filePath);
        deleteFile(filePath);
    }
}
