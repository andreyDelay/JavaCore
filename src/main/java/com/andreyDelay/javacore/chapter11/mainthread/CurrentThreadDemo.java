package main.java.com.andreyDelay.javacore.chapter11.mainthread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread is: " + t);

        //change a name of the thread
        t.setName("My Thread");
        System.out.println("Name of the thread after changing: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }
}
