package main.java.com.andreyDelay.javacore.chapter20.streamsForChars;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushBackReaderDemo {
    public static void main(String[] args) {
        String s = "If (a == 4) a = 0;\n";
        char[] buffer = new char[s.length()];
        s.getChars(0, s.length(), buffer, 0);
        CharArrayReader charArrayReader = new CharArrayReader(buffer);
        int c;

        try (PushbackReader pbr = new PushbackReader(charArrayReader)){
            while ((c = pbr.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c =pbr.read()) == '=') {
                            System.out.print(".eq.");
                        } else {
                            System.out.print("<-");
                            pbr.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
