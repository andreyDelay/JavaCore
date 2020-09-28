package main.java.com.andreyDelay.javacore.chapter28.phaserOnAdvance;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {
    Phaser phaser;
    String name;

    MyThread(Phaser p, String n) {
        phaser = p;
        name = n;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!phaser.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phaser.getPhase());
            System.out.println("Я выполняю один и тот же код в разных фазах!");
            phaser.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
