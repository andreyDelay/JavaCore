package main.java.com.andreyDelay.javacore.chapter18;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(
                "Исходное содержимое values: "
        );
        for(int i: values) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i: values) {
            sum += i;
        }
        System.out.println("Сумма всех значений коллекции равна: " + sum);
    }
}
