package main.java.com.andreyDelay.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fis = null;
        if (args.length != 1) {
            System.out.println("Использование: ShowFile " + "C:\\Users\\Я\\Desktop\\Новый текстовый документ.txt");
        }

        try {
            fis = new FileInputStream("C:\\Users\\Я\\Desktop\\Новый текстовый документ.txt");
            do {
                i = fis.read();
                if (i != -1) System.out.print((char) i);
            }while (i != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
