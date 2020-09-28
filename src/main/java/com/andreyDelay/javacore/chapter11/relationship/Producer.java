package main.java.com.andreyDelay.javacore.chapter11.relationship;

public class Producer implements Runnable{
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Vendor").start();
    }

    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }
    }
}
