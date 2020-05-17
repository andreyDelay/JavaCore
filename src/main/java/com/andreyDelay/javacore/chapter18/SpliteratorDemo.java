package main.java.com.andreyDelay.javacore.chapter18;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        //вызов метода tryAdvance() для вывода содержимого
        System.out.print("Содержимое values: \n");
        Spliterator<Double> spliterator = values.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //Создать новый списоный массив, содержащий квадратные корни числовых значений
        //из списочного массива values
        spliterator = values.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        //Вызвать метод forEachRemaining() для вывода содежримого
        //списочного массива sqrs
        System.out.println("Содержимое списочного массива: \n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
