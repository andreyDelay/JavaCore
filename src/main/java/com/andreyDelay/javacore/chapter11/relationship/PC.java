package main.java.com.andreyDelay.javacore.chapter11.relationship;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("To stop the program, please press Ctrl-C");
    }
}
