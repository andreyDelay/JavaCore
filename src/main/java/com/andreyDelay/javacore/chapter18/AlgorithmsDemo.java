package main.java.com.andreyDelay.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll, (i1, i2) -> i2.compareTo(i1));

        System.out.println("Список отсортирован в обратном порядке");

        for(int i: ll) {
            System.out.print(i + " ");
        }

        System.out.println();
        Collections.shuffle(ll);
        System.out.println("Список перетасован");
        for(int i: ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(Collections.max(ll));
        System.out.println(Collections.min(ll));
    }
}
