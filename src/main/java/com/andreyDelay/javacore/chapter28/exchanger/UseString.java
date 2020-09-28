package main.java.com.andreyDelay.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    Exchanger<String> exchanger;
    String string;

    UseString(Exchanger<String> e) {
        exchanger = e;
        new Thread(this).start();
    }

    public void run() {

        for (int i = 0; i < 3; i++) {
            try {
                string = exchanger.exchange(new String());
                System.out.println("Получено: " + string);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
