package main.java.com.andreyDelay.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

public class ExcgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new UseString(exchanger);
        new MakeString(exchanger);
    }
}
