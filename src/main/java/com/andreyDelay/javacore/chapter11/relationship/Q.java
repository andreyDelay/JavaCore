package main.java.com.andreyDelay.javacore.chapter11.relationship;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение в классе Q метод get()");
            }
        }
            System.out.println("Received: " + n);
            valueSet = false;
            notify();
            return n;

    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение в классе Q метод put()");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Sent: " + n);
        notify();
    }
}
