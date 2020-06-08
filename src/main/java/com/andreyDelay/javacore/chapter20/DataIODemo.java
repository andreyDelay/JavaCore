package main.java.com.andreyDelay.javacore.chapter20;
import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        //вывод тех же данных
        try (DataInputStream din = new DataInputStream(new FileInputStream("test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Получаемые значения: " +
                    d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
