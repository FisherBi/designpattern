package Test;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by fisbii on 16-3-24.
 */
public class Main {
    public static void main(String args[]){
        renameFile("/data/home/fisbii/Documents/Fisher","1.txt","2.txt");
    }

    public static void renameFile(final String path, final String oldname, final String newname) {
        if (!oldname.equals(newname)) {
            File oldfile = new File(path, oldname);
            File newfile = new File(path, newname);
            if (!newfile.exists()) {
                try {
                    oldfile.renameTo(newfile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
