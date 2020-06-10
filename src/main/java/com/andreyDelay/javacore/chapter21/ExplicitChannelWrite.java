package main.java.com.andreyDelay.javacore.chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("testWrite.txt"),
                                                        StandardOpenOption.WRITE,StandardOpenOption.CREATE)){
            //create buffer
            ByteBuffer buffer = ByteBuffer.allocate(26);

            //write some bytes into the buffer
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }

            //prepare buffer for reading and writing the data from it
            buffer.rewind();

            //write data from the buffer to the output file
            channel.write(buffer);

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода :" + e);
            System.exit(1);
        }
    }
}
