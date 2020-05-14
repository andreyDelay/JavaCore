package main.java.com.andreyDelay.javacore.chapter04;

public class ByteShift {
    public static void main(String [] args) {
        byte a = 64, b;
        int i;
        //Сдвиг влево на 2 эквивалентен умножению на 2 в квадрате
        i = a << 2;
        //В связи с переполнением получается 0
        b = (byte) (a << 2);

        System.out.println("Оригинальное значение а: " + a);
        System.out.println("Значение i и b: " + i + " " + b);
    }
}
