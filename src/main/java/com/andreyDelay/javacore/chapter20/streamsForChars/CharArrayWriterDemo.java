package main.java.com.andreyDelay.javacore.chapter20.streamsForChars;

import java.io.*;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        String s = "Эти данные должны быть выведены в массив";
        char [] buffer = new char[s.length()];

        s.getChars(0, s.length(), buffer, 0);

        try {
            writer.write(buffer);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(writer.toString());
        System.out.println("В массив");

        char [] c = writer.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nВ поток вывода типа FileWriter()");

        try (FileWriter fw = new FileWriter("C:\\Users\\Я\\Desktop\\tmp\\test.txt")){
            writer.writeTo(fw);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        System.out.println("Установка в исходное состояние");
        writer.reset();
        for (int i = 0; i < 3; i++) {
            writer.write('X');
        }
        System.out.println(writer.toString());
    }
}
