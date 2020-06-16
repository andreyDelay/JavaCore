package main.java.com.andreyDelay.javacore.chapter29.trysplit;

import java.util.ArrayList;
import java.util.Spliterator;

public class StreamDemo10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");
        list.add("Ksi");
        list.add("Omega");


        Spliterator<String> s1 = list.spliterator();
        Spliterator<String> s2 = s1.trySplit();

        if (s2 != null)
            s2.forEachRemaining(System.out::println);

        System.out.println();
        s1.forEachRemaining(System.out::println);
    }
}
