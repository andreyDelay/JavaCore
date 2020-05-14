package main.java.com.andreyDelay.javacore.chapter02;


public class Example2 {
    public static void main(String [] args) {
        /*
         * This short code shows to us how to initialize a class field
         * and to do a simple multiply operation on it
         */
        int num = 100;

        System.out.println("Это переменная num: " + num);

        num *=2;

        System.out.print("Значение переменной num * 2 равно: ");
        System.out.println(num);
    }
}
