package main.java.com.andreyDelay.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Создание TreeSet
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        //Тут идёт выбор из множества начиная с "C" включительно, заканчивая "F" не включительно
        System.out.println(ts.subSet("C",true,"F",false));
    }
}
