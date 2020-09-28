package main.java.com.andreyDelay.javacore.chapter11.synch;

public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller first = new Caller(target, "Welcome");
        Caller second = new Caller(target, "to synchronized");
        try {
            second.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Caller third = new Caller(target, "WORLD!");

        try {
            first.thread.join();
            second.thread.join();
            third.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted.");
        }
    }
}
