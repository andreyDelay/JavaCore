package main.java.com.andreyDelay.javacore.chapter11.multiplythreads;

public class MultiplyThreadDemo {
    public static void main(String[] args) {
        new NewThread("First");
        new NewThread("Second");
        new NewThread("Third");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        System.out.println("Main thread is finished.");
    }
}
