package main.java.com.andreyDelay.javacore.chapter28.forkJointFramework.recursiveAction2;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {

    public static void main(String[] args) {
        int pLevel;
        int threshold;

        System.out.println(Runtime.getRuntime().availableProcessors());

        if (args.length != 2) {
            System.out.println("Использование: FJExperiment параллелизм порог ");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        long beginT, endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task =
                new Transform(nums, 0, nums.length, threshold);

        beginT = System.nanoTime();
        fjp.invoke(task);

        endT = System.nanoTime();

        System.out.println("Уровень параллелизма: " + pLevel);

        System.out.println("Порог последовательной обработки: " + threshold);
        System.out.println("Истекшее время: " + (endT - beginT) + " нс");
        System.out.println();
    }
}
