package main.java.com.andreyDelay.javacore.chapter20.streamsForBytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {
    public static void main(String[] args) {
        String s = "If (a == 4) a = 0;\n";
        byte [] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;

        try (PushbackInputStream pb = new PushbackInputStream(in)){
            while ((c = pb.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = pb.read()) == '=')
                            System.out.print("eq.");
                        else {
                            System.out.print("<-");
                            pb.unread(c);
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
