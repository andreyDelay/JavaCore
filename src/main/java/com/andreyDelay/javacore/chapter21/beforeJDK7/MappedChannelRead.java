package main.java.com.andreyDelay.javacore.chapter21.beforeJDK7;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelRead {
    public static void main(String[] args) {
        FileInputStream  is = null;
        FileChannel channel = null;

        long fileSize;
        MappedByteBuffer mappedByteBuffer = null;

        try {
            is = new FileInputStream("test.txt");
            channel = is.getChannel();

            fileSize = channel.size();
            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY,0, fileSize);

            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) mappedByteBuffer.get());
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
                if (is != null) is.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла: " + e);
            }
        }
    }
}
