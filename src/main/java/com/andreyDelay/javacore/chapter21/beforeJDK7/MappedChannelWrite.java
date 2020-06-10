package main.java.com.andreyDelay.javacore.chapter21.beforeJDK7;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelWrite {
    public static void main(String[] args) {
        RandomAccessFile out = null;
        FileChannel channel = null;
        ByteBuffer buffer = null;

        try {
            out = new RandomAccessFile("te.txt","rw");

            channel = out.getChannel();
            buffer = channel.map(FileChannel.MapMode.READ_WRITE,0, 26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                 if (channel != null) channel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала.");
            }
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла: " + e);
            }
        }
    }
}
