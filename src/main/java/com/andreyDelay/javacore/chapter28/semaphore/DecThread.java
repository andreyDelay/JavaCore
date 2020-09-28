package main.java.com.andreyDelay.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable{
    String name;
    Semaphore semaphore;

    DecThread(Semaphore s, String n) {
        semaphore = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {

        System.out.println("Thread starting " + name);

            try {
                //get an acquire
                System.out.println("Thread " + name + " is waiting for acquire");
                semaphore.acquire();
                System.out.println("Thread " + name + " is getting an acquire");

                //now it's time to get access to the general resource

                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(name + ": " + Shared.count);

                    //allow if it is possible, switching context
                    Thread.sleep(10);
                }
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }

            //release permission
            System.out.println("Thread " + name + " is releasing permission");
            semaphore.release();
        }
}
