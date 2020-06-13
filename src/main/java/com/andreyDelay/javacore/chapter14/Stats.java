package main.java.com.andreyDelay.javacore.chapter14;

public class Stats<T> {
    T [] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i].doubleValue(); ERROR
        }
        return sum/nums.length;
    }
}
