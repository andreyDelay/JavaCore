package main.java.com.andreyDelay.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int [] c = { 1 };
            c[742] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error index out of array length: " + e);
        }
        System.out.println("After block operators try/catch.");
    }
}
