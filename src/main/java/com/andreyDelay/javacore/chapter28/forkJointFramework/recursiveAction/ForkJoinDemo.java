package main.java.com.andreyDelay.javacore.chapter28.forkJointFramework.recursiveAction;
//Класс ForkJointTask преобразует(через класс RecursiveAction)
//значения элементов массива типа double в их квадратные корни

import java.util.concurrent.ForkJoinPool;

//В данном примере пороговое значение произвольно устанавливается равным 1000
//В реальном коде его оптимальное значение может быть определено в результате
//профилирования исполняющей системы или экспериментально
public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("Часть исходной последовательности:");

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        forkJoinPool.invoke(task);

        System.out.println("Часть преобразованной последовательности:");

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
        System.out.println();
    }
}
