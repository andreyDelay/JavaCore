package main.java.com.andreyDelay.javacore.chapter11.runnable;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demonstration thread");
        System.out.println("Child thread is created: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread was interrupted.");
        }
        System.out.println("Child thread is finished.");
    }
}
