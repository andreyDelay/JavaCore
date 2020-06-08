package main.java.com.andreyDelay.javacore.chapter20.dirlistonly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "d:\\Programmer\\Java\\Книги";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt("djvu");
        String [] s = f1.list(only);

            for (int i = 0; i < s.length; i++) {
                    System.out.println(s[i]);
            }
    }
}
