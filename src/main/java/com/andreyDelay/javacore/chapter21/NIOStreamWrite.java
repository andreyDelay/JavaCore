package main.java.com.andreyDelay.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOStreamWrite {
    public static void main(String[] args) {

        try (OutputStream os = new BufferedOutputStream(
                                Files.newOutputStream(
                                        Paths.get("NIOOutput.txt"),
                                        StandardOpenOption.CREATE,StandardOpenOption.WRITE)))
        {
            for (int i = 0; i < 26; i++) {
                os.write((byte) 'A' + i);
            }


        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
