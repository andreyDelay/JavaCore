package main.java.com.andreyDelay.javacore.chapter22;
import java.io.*;
import java.net.*;

public class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        //создать сокетное соединение с веб сайтом internic.net
        //через порт 43
        Socket s = new Socket("whois.WHOIS-SERVICE.RU", 43);

        //получить потоки ввода вывода
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        //сформировать строку запроса
        String str = (args.length == 0 ? "vk.com" :args[0] + "\n");

        //преобразовать сроку в байты
        byte [] buffer = str.getBytes();

        out.write(buffer);

        //прочитать ответ и вывести его на экран
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
