package main.java.com.andreyDelay.javacore.chapter11.interrupt;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("First");
        NewThread t2 = new NewThread("Second");

        try {
            Thread.sleep(1000);
            t1.mySuspend();
            System.out.println("Приостановка первого потока");
            Thread.sleep(1000);
            t1.myResume();
            System.out.println("Возобновление первого потока");

            Thread.sleep(1000);
            t2.mySuspend();
            System.out.println("Приостановка второго потока");
            Thread.sleep(1000);
            t2.myResume();
            System.out.println("Возобновление второго потока");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        try {
            System.out.println("Ожидание завершения потоков.");
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}
