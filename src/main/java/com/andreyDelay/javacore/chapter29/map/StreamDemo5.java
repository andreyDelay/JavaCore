package main.java.com.andreyDelay.javacore.chapter29.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamDemo5 {
    public static void main(String[] args) {

        List<NamePhoneEmail> myList =Arrays.asList
                (
                        new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"),
                        new NamePhoneEmail("Джеймс", "555-4444", "James@HerbSchildt.com"),
                        new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com")
                );
        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach((a) -> System.out.println(a.name + " " + a.phoneName + " " + a.email));
        System.out.println("==================================");

        Stream<NamePhone> nameAndPhone =
                            myList.stream().map
                                    (
                                    (a) -> new NamePhone(a.name, a.phoneName)
                                    );
        System.out.println("Список имён и номеров телефонов: ");
        nameAndPhone.forEach((a) -> System.out.println(a.name + " " + a.phoneNum));

        Stream<NamePhone> j =
                    myList.stream()
                            .filter((a) -> a.name.equals("Джеймс"))
                            .map((a) -> new NamePhone(a.name, a.phoneName));

    }
}
