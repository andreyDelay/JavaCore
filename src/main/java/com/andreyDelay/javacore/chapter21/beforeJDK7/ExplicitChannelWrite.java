package main.java.com.andreyDelay.javacore.chapter21.beforeJDK7;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        FileOutputStream os = null;
        FileChannel channel = null;
        ByteBuffer buffer = null;

        try {
            os = new FileOutputStream("ttt.txt");
            channel = os.getChannel();
            buffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            buffer.rewind();

            channel.write(buffer);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                if (channel != null) channel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала.");
            }
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла: " + e);
            }
        }
    }
}
