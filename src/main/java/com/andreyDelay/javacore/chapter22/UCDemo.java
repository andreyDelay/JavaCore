package main.java.com.andreyDelay.javacore.chapter22;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("https://javastudy.ru/interview/input-output/");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("Сведения о дате отсутствуют");
        else
            System.out.println("Дата: " + new Date(d));

        System.out.println("Тип содержимого: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0)
            System.out.println("Сведения о сроке действия отсутствуют.");
        else
            System.out.println("Срок действия истекает: " + new Date(d));

        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println("Сведения о дате модификации отсутствуют.");
        else
            System.out.println("Дата последней модификации: " + new Date(d));

        long length = hpCon.getContentLengthLong();
        if (length == -1)
            System.out.println("Длина содержимого недоступна.");
        else
            System.out.println("Длина содержимого: " + length);

        if (length != 0) {
            System.out.println("=== Содержимое ===");
            InputStreamReader is = new InputStreamReader(hpCon.getInputStream());
            while (((c = is.read()) != -1)) {
                System.out.print((char) c);
            }
            is.close();
        } else {
            System.out.println("Содержимое недоступно.");
        }
    }
}
