package main.java.com.andreyDelay.javacore.chapter20.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream obgOutput = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Я\\Desktop\\serial.txt"))){
            MyClass object1 = new MyClass("Hello", -7,2.7e10);
            System.out.println("object1: " + object1);

            obgOutput.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации: " + e);
        }

        try (ObjectInputStream obgInput = new ObjectInputStream(new FileInputStream("C:\\Users\\Я\\Desktop\\serial.txt"))){
            MyClass object2 = (MyClass)obgInput.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Ошибка при десериализации: " + e);
            System.exit(0);
        }
    }
}
