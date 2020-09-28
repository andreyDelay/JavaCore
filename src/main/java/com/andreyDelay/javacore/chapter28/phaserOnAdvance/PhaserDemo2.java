package main.java.com.andreyDelay.javacore.chapter28.phaserOnAdvance;

public class PhaserDemo2 {
    public static void main(String[] args) {

        MyPhaser phaser = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершён!");
    }
}
