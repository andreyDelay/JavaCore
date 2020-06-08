package main.java.com.andreyDelay.javacore.chapter20.streamsForChars;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "This is a sign of author &copy; , but &copy - not.\n";
        char[] buffer = new char[s.length()];
        s.getChars(0, s.length(), buffer, 0);

        CharArrayReader in = new CharArrayReader(buffer);
        int c;
        boolean marked = false;

        try (BufferedReader br = new BufferedReader(in)){
            while ((c = br.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            br.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            br.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
