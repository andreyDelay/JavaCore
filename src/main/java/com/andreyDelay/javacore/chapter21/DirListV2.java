package main.java.com.andreyDelay.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirListV2 {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\Я\\IdeaProjects\\javacore\\";

        DirectoryStream.Filter<Path> how = filename -> {
                    if (Files.isWritable(filename)) return true;
                    return false;
                };
        //получить и использовать поток ввода из каталога
        try (DirectoryStream<Path> is = Files.newDirectoryStream(Paths.get(dirName), how)){
            System.out.println();
            for(Path p: is) {
                BasicFileAttributes attributes =
                Files.readAttributes(p, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("        ");

                System.out.println(p.getName(4));
            }

        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (NotDirectoryException e) {
            System.out.println("Ошибка чтения директории: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
