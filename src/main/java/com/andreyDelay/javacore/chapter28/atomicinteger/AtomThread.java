package main.java.com.andreyDelay.javacore.chapter28.atomicinteger;

public class AtomThread implements Runnable {
    String name;

    AtomThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Thread starting " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread " + name + " received: " +
                    Shared.ai.getAndSet(i));
        }
    }
}
