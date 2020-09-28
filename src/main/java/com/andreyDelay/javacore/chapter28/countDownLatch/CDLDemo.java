package main.java.com.andreyDelay.javacore.chapter28.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Thread starting");
        new MyThread(cdl);

        try {
            cdl.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread finishing");
    }
}
