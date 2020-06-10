package main.java.com.andreyDelay.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        //получаем путь к файлу
        try {
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
            return;
        }

        //затем получить канал к этому файлу
        //в блоке оператора try с ресурасми

        try (SeekableByteChannel channel = Files.newByteChannel(filepath)){
            //выделить память под буфер
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do {
                count = channel.read(buffer);

                if (count != -1) {
                    buffer.rewind();
//                    byte [] b = buffer.array();
//                    InputStreamReader input = new InputStreamReader(new ByteArrayInputStream(b));
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            }while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
