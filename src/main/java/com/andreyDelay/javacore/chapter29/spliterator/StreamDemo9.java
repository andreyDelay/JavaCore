package main.java.com.andreyDelay.javacore.chapter29.spliterator;

import java.util.ArrayList;

public class StreamDemo9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Ksi");
        myList.add("Omega");

        myList.stream()
                .spliterator()
                .forEachRemaining(System.out::println);
    }
}
