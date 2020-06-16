package main.java.com.andreyDelay.javacore.chapter29.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Ksi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Iterator<String> iterator = myStream.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
