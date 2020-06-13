package main.java.com.andreyDelay.javacore.chapter14.bounds;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer nums [] = {1,2,3,4,5};
        StatsV2<Integer> ob = new StatsV2<>(nums);
        double v = ob.average();
        System.out.println("Среднее значение равно: " + v);

        Double dnums [] = {1.1,2.2,3.3,4.4,5.5};
        StatsV2<Double> od = new StatsV2<>(dnums);
        double w = od.average();
        System.out.println("Среднее значение №2: " + w);
    }
}
