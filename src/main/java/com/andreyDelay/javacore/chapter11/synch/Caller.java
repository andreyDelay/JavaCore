package main.java.com.andreyDelay.javacore.chapter11.synch;

public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread thread;

    public Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
