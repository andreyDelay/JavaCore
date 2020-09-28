package main.java.com.andreyDelay.javacore.chapter28.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {

        System.out.println("Thread starting " + name);

        try {
            System.out.println("Thread " + name + " is waiting " +
                    "for counter's blocking");
            lock.lock();
            System.out.println("Thread " + name + " is blocking counter");
            Shared.count++;
            System.out.println("Thread " + name + ": " + Shared.count);

            //переключение контекста, если это возможно
            System.out.println("Thread " + name + " is waiting");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("Thread " + name + " is unblocking counter");
            lock.unlock();
        }
    }
}
