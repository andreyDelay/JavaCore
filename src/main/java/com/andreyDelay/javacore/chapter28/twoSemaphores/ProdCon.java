package main.java.com.andreyDelay.javacore.chapter28.twoSemaphores;

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
