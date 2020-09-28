package main.java.com.andreyDelay.javacore.chapter11.joinIsalive;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("First");
        NewThread ob2 = new NewThread("Second");
        NewThread ob3 = new NewThread("Third");

        System.out.println("First thread is started: " + ob1.t.isAlive());
        System.out.println("Second thread is started: " + ob2.t.isAlive());
        System.out.println("Third thread is started: " + ob3.t.isAlive());

        try {
            System.out.println("Waiting for finishing of all the threads.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("First thread is started: " + ob1.t.isAlive());
        System.out.println("Second thread is started: " + ob2.t.isAlive());
        System.out.println("Third thread is started: " + ob3.t.isAlive());

        System.out.println("Main thread is finished.");
    }
}
