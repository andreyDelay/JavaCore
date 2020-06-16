package main.java.com.andreyDelay.javacore.chapter29.myexample;

import java.util.stream.Stream;

public class PhoneStream {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of
        (
                new Phone("iPhone 6 S", 1),
                new Phone("Lumia 950", 2),
                new Phone("Samsung Galaxy S 6", 3),
                new Phone("LG G 4", 4)
        );
        //1*10 + 2*10 + 3*10 + 4*10
        int sum = phoneStream.reduce(10, (identity, phone) -> identity * phone.getPrice(), (left, right) ->left + right);

        System.out.println(sum);
    }
}
