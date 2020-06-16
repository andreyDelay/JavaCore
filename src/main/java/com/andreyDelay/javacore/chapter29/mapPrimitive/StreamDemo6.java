package main.java.com.andreyDelay.javacore.chapter29.mapPrimitive;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(1.1);
        list.add(3.6);
        list.add(9.2);
        list.add(4.7);
        list.add(12.1);
        list.add(5.0);

        System.out.println("Исходные значения: ");
        list.stream().forEach((a) -> System.out.println(a + ""));
        System.out.println("****====****");

        IntStream integers = list.stream().mapToInt((a) -> (int) Math.ceil(a));
        integers.forEach((a) -> System.out.println(a +""));

    }
}
