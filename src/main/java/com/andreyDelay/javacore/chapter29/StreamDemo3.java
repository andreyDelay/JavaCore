package main.java.com.andreyDelay.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<>();
        myList.add(9.0);
        myList.add(9.0);

    double productOfSqrRoots = myList.parallelStream().reduce(
            2.0,(a,b) -> a * Math.sqrt(b),
            (a,b) -> a + b
    );

        System.out.println(
                "Произведение квадратных корней: " + productOfSqrRoots
        );
    }
}
