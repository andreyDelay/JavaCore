package main.java.com.andreyDelay.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Применение статического метода copy() для" +
                    "копирования файла " + args[0] + " в файл " + args[1]);
        }

        try {
            Path source = Paths.get(args[0]);
            Path dest = Paths.get(args[1]);

            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
