package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by fisbii on 16-3-24.
 */
public class Main {
    public static void main(String args[]){
        File file = new File("/data/home/fisbii/dockerconf/backend/audit/key/rsa_greenback.public");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getName(),true);
            fileOutputStream.write("aaabbb".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
