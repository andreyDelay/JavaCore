package main.java.com.andreyDelay.javacore.chapter20;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDemo {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите текст: ");
        str = br.readLine();
        System.out.printf("Введённая вами строка: %s\n", str);
    }
}
