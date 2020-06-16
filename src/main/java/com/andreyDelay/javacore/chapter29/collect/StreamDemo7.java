package main.java.com.andreyDelay.javacore.chapter29.collect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {

        List<NamePhoneEmail> myList = Arrays.asList
                (
                        new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"),
                        new NamePhoneEmail("Джеймс", "555-4444", "James@HerbSchildt.com"),
                        new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com")
                ).stream().collect(Collectors.toList());


        Stream<NamePhone> j =
                myList.stream()
                        .map((a) -> new NamePhone(a.name, a.phoneName))
                        .sorted(Comparator.comparing(v -> v.name));

        Set<NamePhone> set = j.collect(Collectors.toSet());

        for(NamePhone namePhone: set) {
            System.out.println(namePhone.name + " " + namePhone.phoneNum);
        }

        //Небольшая проверка полученных знаний
        List<NamePhone> forLL = myList.stream()
                                        .map((a) -> new NamePhone(a.name, a.phoneName))
                                        .sorted(Comparator.comparing(v -> v.name))
                                        .collect(Collectors.toList());

        //Проверка расширенного метода collect()
        Stream<NamePhone> linked = myList.stream().map((a) -> new NamePhone(a.name, a.phoneName));
        LinkedList<NamePhone> result = linked.collect
                (
                                                () -> new LinkedList<>(),
                                                (list, element) -> list.add(element),
                                                (listA,listB) -> listA.addAll(listB)
                );
        System.out.println(result);

    }
}
