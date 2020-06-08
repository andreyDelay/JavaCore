package main.java.com.andreyDelay.javacore.chapter20.streamsForBytes;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream fis =
                     new FileInputStream("C:\\Users\\Я\\IdeaProjects\\javacore\\src\\main\\java\\com\\andreyDelay\\javacore\\chapter20\\Новый текстовый документ.txt")){
            System.out.println("Общее количество доступных байтов: " + (size = fis.available()));
            int n = size / 20;
            System.out.println("Первые " + n + " байтов, " +
                    "прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.println((char) fis.read());
            }

            System.out.println("\nВсё ещё доступно: " + fis.available());

            System.out.println("Чтение следующих " + n +
                    " байтов по очереди методом read(b [])");
            byte [] b = new byte[n];
            if (fis.read(b) != n) {
                System.out.println("Нельзя прочитать " + n + " байтов");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("\nВсё ещё доступно: " + (size = fis.available()));

            System.out.println(
                    "Пропустить половину оставшихся байтов методом skip()"
            );
            fis.skip(size/2);

            System.out.println("\nВсё ещё доступно: " + fis.available());

            System.out.println("Чтение " + n / 2 + " байтов, размещаемых в конце массива");

            if (fis.read(b, n-3, n-3) !=n/2) {
                System.out.println("Нельзя прочитать " + n / 2 + " байтов.");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсё ещё доступно: " + fis.available());
        } catch (IOException e) {

        }
    }
}
