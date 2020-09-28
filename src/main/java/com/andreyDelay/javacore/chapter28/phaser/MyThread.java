package main.java.com.andreyDelay.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable{
    Phaser phaser;
    String name;

    MyThread(Phaser p, String n) {
        phaser = p;
        name = n;
        phaser.register();
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance(); // известить о достижении фазы

        //небольшая пауза, чтобы не нарушить порядок вывода
        //Только для иллюстрации, но не обязательно для правильного
        //функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phaser.arriveAndDeregister();
    }
}
