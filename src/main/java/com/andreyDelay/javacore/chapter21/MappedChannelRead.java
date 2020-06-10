package main.java.com.andreyDelay.javacore.chapter21;

import java.io.*;

import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){
            //получить размер файла
            long fileSize = channel.size();

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,0,fileSize);

            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) buffer.get());
            }
            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
