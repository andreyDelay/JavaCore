package main.java.com.andreyDelay.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.print(
                "Исходное содержимое arraylist :"
        );
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String currElem = iterator.next();
            System.out.print(currElem + " ");
        }
        System.out.println();

        ListIterator<String> lItr = arrayList.listIterator();
        while (lItr.hasNext()) {
            String currElem = lItr.next();
            lItr.set(currElem + "+");
        }

        System.out.println("Изменённое содержимое arraylist: ");
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String currElem = iterator.next();
            System.out.print(currElem + " ");
        }
        System.out.println();

        System.out.println("В обратном порядке: ");
        while (lItr.hasPrevious()) {
            String currElem = lItr.previous();
            System.out.print(currElem + " ");
        }
        System.out.println();

    }
}
