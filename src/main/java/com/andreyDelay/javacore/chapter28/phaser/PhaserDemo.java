package main.java.com.andreyDelay.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int currentPhase;

        System.out.println("запуск потоков");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        //ожидаем завершения всеми потоками исполнения второй фазы
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("фаза " + currentPhase + " завершена");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("фаза " + currentPhase + " завершена");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("фаза " + currentPhase + " завершена");

        //снять основной поток исполнения с регистрации
        phaser.arriveAndDeregister();

        if (phaser.isTerminated())
            System.out.println("Синхронизатор фаз завершён");

    }
}
