package main.java.com.andreyDelay.javacore.chapter20.sequenceIS;

import java.io.*;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
    int c;
        Vector<String> files = new Vector<>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);


        try (InputStreamReader isr = new InputStreamReader(new SequenceInputStream(ise))){
            while ((c =isr.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
