package main.java.com.andreyDelay.javacore.chapter28.twoSemaphores;

import java.util.concurrent.Semaphore;

public class Q {
    int n;

    //start from unavailable semaphore of consumer
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException exception) {
            System.out.println("Exception was cached. " + exception.getMessage());
        }

        System.out.println("Received: " + n);
        semProd.release();
    }

    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException exception) {
            System.out.println("Exception was cached. " + exception.getMessage());
        }
        this.n = n;
        System.out.println("Sent: " + n);
        semCon.release();
    }
}
