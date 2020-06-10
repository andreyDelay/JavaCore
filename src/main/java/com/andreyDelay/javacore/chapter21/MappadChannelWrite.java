package main.java.com.andreyDelay.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappadChannelWrite {
    public static void main(String[] args) {

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("ttt.txt"),
                                                        StandardOpenOption.WRITE,
                                                        StandardOpenOption.READ,
                                                        StandardOpenOption.CREATE))
        {
            //сопоставление файла с буфером
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE,0, 26);

            //запись в буфер, а следовательно неявно и в файл
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
