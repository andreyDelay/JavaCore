package main.java.com.andreyDelay.javacore.chapter21.beforeJDK7;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        FileInputStream is = null;
        FileChannel channel = null;
        ByteBuffer buffer = null;

//        InputStreamReader isr = null;
        int counter;

        try {
            is = new FileInputStream("test.txt");
            channel = is.getChannel();
            buffer = ByteBuffer.allocate(128);

            do {
                counter = channel.read(buffer);

                if (counter != -1) {
                    buffer.rewind();

//                    isr = new InputStreamReader(new ByteArrayInputStream(buffer.array()));

                    for (int i = 0; i < counter; i++)
                        System.out.print((char) buffer.get());
                    System.out.println();
//                    int tmp;
//                    while ((tmp = isr.read()) != -1) {
//                        System.out.print((char) tmp);
//                    }
                }
            }while (counter != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                if (channel != null) channel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала: " + e);
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла: " + e);
            }
//            try {
//                if (isr != null) isr.close();
//            } catch (IOException e) {
//                System.out.println("Не удалось закрыть поток символов: " + e);
//            }
        }
    }
}
