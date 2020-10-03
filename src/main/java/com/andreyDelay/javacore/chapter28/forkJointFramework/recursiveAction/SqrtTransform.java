package main.java.com.andreyDelay.javacore.chapter28.forkJointFramework.recursiveAction;

import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 1000;

    double [] data;

    int start, end;

    SqrtTransform(double [] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    //этот метод выполняет параллельное вычисление
    protected void compute() {
        //Если количество элементов меньше порогового значения,
        //выполнить дальнейшую обработку последовательно
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}
