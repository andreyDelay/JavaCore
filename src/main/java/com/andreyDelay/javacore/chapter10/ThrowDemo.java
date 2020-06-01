package main.java.com.andreyDelay.javacore.chapter10;

public class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("демонстрация.");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoProc().");
            throw e; //повторная генерация исключения
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
