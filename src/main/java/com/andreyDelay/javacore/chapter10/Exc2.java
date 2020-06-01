package main.java.com.andreyDelay.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Этот текст не будет выведен.");
        } catch (ArithmeticException e) { //перехват ошибки деления на нуль
            System.out.println("Деление на нуль!");
        }
        System.out.println("После оператора catch.");
    }
}
