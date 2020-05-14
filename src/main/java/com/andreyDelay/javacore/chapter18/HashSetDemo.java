package main.java.com.andreyDelay.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //создание HashSet
        HashSet<String> hs = new HashSet<>();

        //Добавление элементов в hs
        hs.add("Гулькевичи");
        hs.add("Краснодар");
        hs.add("Ростов-на-Дону");
        hs.add("Ставрополь");
        hs.add("Тобольск");
        hs.add("Свободный");
        hs.add("Москва");

        System.out.println(hs);
    }
}
