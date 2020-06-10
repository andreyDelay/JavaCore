package main.java.com.andreyDelay.javacore.chapter21;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Применение ShowFile NIO для файла " + args[0]);
            return;
        }

        try (InputStream is = new BufferedInputStream(Files.newInputStream(Paths.get(args[0])));
             InputStreamReader isr = new InputStreamReader(is))
        {
            do {
                i = isr.read();
                if (i != -1 ) {
                    System.out.print((char) i);
                }
            }while (i != -1);

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
