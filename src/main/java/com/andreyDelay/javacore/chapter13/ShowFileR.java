package main.java.com.andreyDelay.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileR {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Использование: ShowFile " + "C:\\Users\\Я\\Desktop\\Новый текстовый документ.txt");
        }

        try(FileInputStream fis = new FileInputStream("C:\\Users\\Я\\Desktop\\Новый текстовый документ.txt")) {

            do {
                i = fis.read();
                if (i != -1) System.out.print((char) i);
            }while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
