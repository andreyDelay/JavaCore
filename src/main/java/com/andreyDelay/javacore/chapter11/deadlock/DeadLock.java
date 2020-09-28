package main.java.com.andreyDelay.javacore.chapter11.deadlock;

public class DeadLock implements Runnable {

    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Соперник");
        t.start();

        a.foo(b); //получить блокировку объекта a
                    //в этом потоке исполнения
        System.out.println("Назад в главный поток");
    }

    public void run() {
        b.bar(a);   //получить блокировку потока b
                    //в другом потоке исполнения
        System.out.println("Назад в другой поток.");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
