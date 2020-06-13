package main.java.com.andreyDelay.javacore.chapter14.bounds;

public class StatsV2<T extends Number> {
    T [] nums;

    StatsV2(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

}
