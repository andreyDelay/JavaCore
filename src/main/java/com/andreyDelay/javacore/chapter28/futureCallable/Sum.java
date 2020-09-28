package main.java.com.andreyDelay.javacore.chapter28.futureCallable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
