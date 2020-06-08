package main.java.com.andreyDelay.javacore.chapter20.streamsForChars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("file1.txt")) {
            int c;

            while ((c = fr.read()) != -1) {
                System.out.print((char ) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
