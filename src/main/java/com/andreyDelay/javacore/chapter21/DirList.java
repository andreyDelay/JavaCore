package main.java.com.andreyDelay.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


public class DirList {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\Я\\IdeaProjects\\javacore\\";

        try (DirectoryStream<Path> dirList =
                     Files.newDirectoryStream(Paths.get(dirName),"*.{txt}"))
        {
            System.out.println("Каталог " + dirName);

            for(Path p: dirList) {
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
            System.out.println("Ошибка директории: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
