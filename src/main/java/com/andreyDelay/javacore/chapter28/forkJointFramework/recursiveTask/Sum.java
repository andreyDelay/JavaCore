package main.java.com.andreyDelay.javacore.chapter28.forkJointFramework.recursiveTask;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Double> {

    final int seqThreshold = 500;
    double[] nums;
    int start, end;

    Sum(double[] vals, int s, int e) {
        nums = vals;
        start = s;
        end = e;
    }

    @Override
    protected Double compute() {
        double sum = 0;

        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                sum += nums[i];
            }
        } else {
            int middle = (start + end) / 2;

            Sum subTaskA = new Sum(nums, start, middle);
            Sum subTaskB = new Sum(nums, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}
