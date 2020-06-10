package main.java.com.andreyDelay.javacore.chapter21;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelReadV2 {
    public static void main(String[] args) {
        int count;

        try (SeekableByteChannel channel = Files.newByteChannel(Paths.get("test.txt"))) {
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do {
                count = channel.read(buffer);

            if (count != -1) {
                buffer.rewind();

                InputStreamReader is = new InputStreamReader(new ByteArrayInputStream(buffer.array()));
                int ch;

                while ((ch = is.read()) != -1) {
                    System.out.print((char) ch);
                }
                is.close();
            }

            }while (count != -1);

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
