package main.java.com.andreyDelay.javacore.chapter28.simpleExecutor;

import java.util.concurrent.CountDownLatch;

public class MT implements Runnable {
    String name;
    CountDownLatch latch;

    MT(CountDownLatch c, String n) {
        latch = c;
        name = n;
        new Thread(this);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
