package main.java.com.andreyDelay.javacore.chapter21.dirTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\Я\\IdeaProjects\\javacore\\";

        System.out.println("Древо каталогов , начиная с каталога \"javacore\"");

        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
